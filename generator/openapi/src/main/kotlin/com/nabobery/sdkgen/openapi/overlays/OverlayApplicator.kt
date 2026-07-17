package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode

public class OverlayApplicator(
    private val zeroMatchMode: ZeroMatchMode = ZeroMatchMode.STRICT,
    private val conflictPolicy: ConflictPolicy = ConflictPolicy.FAIL,
    private val selector: JsonPathSelector = Rfc9535Selector(),
) {
    private val extensionValidator: CanonicalExtensionValidator = CanonicalExtensionValidator()

    public fun apply(
        source: ByteArray,
        overlays: List<OverlayInput>,
    ): OverlayApplicationResult {
        val original = DocumentCodec.parse(source)
        var document = original.deepCopy<JsonNode>()
        val manifest = mutableListOf<AppliedOverlay>()
        val appliedActions = mutableListOf<AppliedAction>()
        val writes = mutableMapOf<String, RecordedWrite>()

        overlays.forEach { input ->
            val overlay = parseOverlay(input)
            overlay.actions.forEachIndexed { index, action ->
                if (!action.remove && action.update == null && action.copy != null) {
                    selector.validate(action.copy, JsonPathSource(input.identity, index, "copy"))
                }
                val pointers =
                    selector
                        .selectPointers(
                            document,
                            action.target,
                            JsonPathSource(input.identity, index, "target"),
                        ).distinct()
                        .sorted()
                if (pointers.isEmpty() && zeroMatchMode == ZeroMatchMode.STRICT) {
                    throw ZeroMatchException(
                        "Overlay '${input.identity}' action $index matched zero nodes: ${action.target}",
                    )
                }
                var sourcePointers = emptyList<String>()
                val kind =
                    when {
                        action.remove -> {
                            removeMatches(document, pointers, input.identity, writes)
                            "remove"
                        }

                        action.update != null -> {
                            validateTargetKinds(document, pointers, input.identity, index, "update")
                            pointers.forEach { pointer ->
                                document = applyUpdate(document, pointer, action.update, input.identity, writes)
                            }
                            "update"
                        }

                        action.copy != null -> {
                            validateTargetKinds(document, pointers, input.identity, index, "copy")
                            if (pointers.isNotEmpty()) {
                                sourcePointers =
                                    selector
                                        .selectPointers(
                                            document,
                                            action.copy,
                                            JsonPathSource(input.identity, index, "copy"),
                                        ).distinct()
                                        .sorted()
                                if (sourcePointers.size != 1) {
                                    val message =
                                        buildString {
                                            append("Overlay '").append(input.identity).append("' action ").append(index)
                                            append(
                                                " copy must select exactly one node, matched ",
                                            ).append(sourcePointers.size)
                                            append(": ").append(action.copy)
                                        }
                                    throw CopySourceMatchException(message)
                                }
                                val copied = document.at(sourcePointers.single()).deepCopy<JsonNode>()
                                pointers.forEach { pointer ->
                                    document = applyUpdate(document, pointer, copied, input.identity, writes)
                                }
                            }
                            "copy"
                        }

                        else -> {
                            throw OverlayFormatException(
                                "Overlay '${input.identity}' action $index must define update, copy, or remove: true",
                            )
                        }
                    }
                appliedActions +=
                    AppliedAction(
                        overlayIdentity = input.identity,
                        actionIndex = index,
                        target = action.target,
                        matchedPointers = pointers,
                        kind = kind,
                        copyFrom = action.copy.takeIf { kind == "copy" },
                        sourcePointers = sourcePointers,
                    )
            }
            manifest +=
                AppliedOverlay(
                    identity = input.identity,
                    title = overlay.title,
                    version = overlay.version,
                    sha256 = DocumentCodec.sha256(input.content),
                    actionCount = overlay.actions.size,
                )
        }

        extensionValidator.validate(document)
        val canonicalDocument = DocumentCodec.canonicalNode(document)
        return OverlayApplicationResult(
            document = canonicalDocument,
            overlays = manifest,
            actions = appliedActions,
            changes = EffectiveDiff.between(original, canonicalDocument),
        )
    }

    private fun validateTargetKinds(
        root: JsonNode,
        pointers: List<String>,
        overlayIdentity: String,
        actionIndex: Int,
        kind: String,
    ) {
        val kinds =
            pointers
                .map { pointer ->
                    val target = root.at(pointer)
                    when {
                        target.isObject -> "objects"
                        target.isArray -> "arrays"
                        target.isValueNode -> "primitives"
                        else -> throw OverlayFormatException("Selected pointer no longer exists: $pointer")
                    }
                }.distinct()
        if (kinds.size > 1) {
            throw OverlayFormatException(
                "Overlay '$overlayIdentity' action $actionIndex $kind target nodes must be all objects, " +
                    "all arrays, or all primitives; found ${kinds.sorted().joinToString()}",
            )
        }
    }

    private fun applyUpdate(
        root: JsonNode,
        pointer: String,
        update: JsonNode,
        overlayIdentity: String,
        writes: MutableMap<String, RecordedWrite>,
    ): JsonNode {
        val target = root.at(pointer)
        if (target.isMissingNode) {
            throw OverlayFormatException("Selected pointer no longer exists: $pointer")
        }
        return when {
            target.isObject && update.isObject -> {
                mergeObject(target as ObjectNode, update as ObjectNode, pointer, overlayIdentity, writes)
                root
            }

            target.isArray -> {
                recordArrayMutation(pointer, update, overlayIdentity, writes)
                val array = target as ArrayNode
                if (update.isArray) {
                    update.forEach { array.add(it.deepCopy<JsonNode>()) }
                } else {
                    array.add(update.deepCopy<JsonNode>())
                }
                root
            }

            target.isValueNode && update.isValueNode -> {
                recordWrite(pointer, update, overlayIdentity, writes)
                JsonPointerSupport.replace(root, pointer, update)
            }

            else -> {
                throw OverlayFormatException(
                    "Incompatible Overlay update at $pointer: target=${target.nodeType}, update=${update.nodeType}",
                )
            }
        }
    }

    private fun mergeObject(
        target: ObjectNode,
        update: ObjectNode,
        pointer: String,
        overlayIdentity: String,
        writes: MutableMap<String, RecordedWrite>,
    ) {
        update.fieldNames().asSequence().toList().sorted().forEach { name ->
            val updateValue = update.get(name)
            val childPointer = JsonPointerSupport.child(pointer, name)
            val targetValue = target.get(name)
            when {
                targetValue == null -> {
                    recordSubtreeWrites(childPointer, updateValue, overlayIdentity, writes)
                    target.set<JsonNode>(name, updateValue.deepCopy())
                }

                targetValue.isObject && updateValue.isObject -> {
                    mergeObject(
                        targetValue as ObjectNode,
                        updateValue as ObjectNode,
                        childPointer,
                        overlayIdentity,
                        writes,
                    )
                }

                targetValue.isArray && updateValue.isArray -> {
                    recordArrayMutation(childPointer, updateValue, overlayIdentity, writes)
                    updateValue.forEach { (targetValue as ArrayNode).add(it.deepCopy<JsonNode>()) }
                }

                targetValue.isValueNode && updateValue.isValueNode -> {
                    recordWrite(childPointer, updateValue, overlayIdentity, writes)
                    target.set<JsonNode>(name, updateValue.deepCopy())
                }

                else -> {
                    throw OverlayFormatException(
                        "Incompatible Overlay merge at $childPointer: " +
                            "target=${targetValue.nodeType}, update=${updateValue.nodeType}",
                    )
                }
            }
        }
    }

    private fun removeMatches(
        root: JsonNode,
        pointers: List<String>,
        overlayIdentity: String,
        writes: MutableMap<String, RecordedWrite>,
    ) {
        pointers.sortedWith(removeOrder()).forEach { pointer ->
            recordRemoval(pointer, overlayIdentity, writes)
            JsonPointerSupport.remove(root, pointer)
        }
    }

    private fun removeOrder(): Comparator<String> =
        Comparator { left, right ->
            val leftParent = left.substringBeforeLast('/', "")
            val rightParent = right.substringBeforeLast('/', "")
            if (leftParent == rightParent) {
                val leftIndex = left.substringAfterLast('/').toIntOrNull()
                val rightIndex = right.substringAfterLast('/').toIntOrNull()
                if (leftIndex != null && rightIndex != null) rightIndex.compareTo(leftIndex) else right.compareTo(left)
            } else {
                right.compareTo(left)
            }
        }

    private fun recordSubtreeWrites(
        pointer: String,
        value: JsonNode,
        overlayIdentity: String,
        writes: MutableMap<String, RecordedWrite>,
    ) {
        when {
            value.isObject && value.size() > 0 -> {
                value.fieldNames().asSequence().toList().sorted().forEach { name ->
                    recordSubtreeWrites(
                        JsonPointerSupport.child(pointer, name),
                        value.get(name),
                        overlayIdentity,
                        writes,
                    )
                }
            }

            else -> {
                recordWrite(pointer, value, overlayIdentity, writes)
            }
        }
    }

    private fun recordWrite(
        pointer: String,
        value: JsonNode,
        overlayIdentity: String,
        writes: MutableMap<String, RecordedWrite>,
    ) = record(
        pointer,
        "value:${DocumentCodec.canonicalJson(value)}",
        overlayIdentity,
        destructive = false,
        writes = writes,
    )

    private fun recordArrayMutation(
        pointer: String,
        value: JsonNode,
        overlayIdentity: String,
        writes: MutableMap<String, RecordedWrite>,
    ) = record(
        pointer,
        "array-append:${DocumentCodec.canonicalJson(value)}",
        overlayIdentity,
        destructive = true,
        allowsExactComposition = true,
        writes = writes,
    )

    private fun recordRemoval(
        pointer: String,
        overlayIdentity: String,
        writes: MutableMap<String, RecordedWrite>,
    ) = record(pointer, "removed", overlayIdentity, destructive = true, writes = writes)

    private fun record(
        pointer: String,
        value: String,
        overlayIdentity: String,
        destructive: Boolean,
        allowsExactComposition: Boolean = false,
        writes: MutableMap<String, RecordedWrite>,
    ) {
        val conflict =
            writes.entries
                .asSequence()
                .filter { (previousPointer, previous) ->
                    previous.overlayIdentity != overlayIdentity && overlaps(previousPointer, pointer)
                }.sortedBy { (previousPointer, _) -> previousPointer }
                .firstOrNull { (previousPointer, previous) ->
                    if (previousPointer != pointer) {
                        true
                    } else {
                        val composable = previous.allowsExactComposition && allowsExactComposition
                        val identical = !previous.destructive && !destructive && previous.value == value
                        !composable && !identical
                    }
                }
        if (conflict != null && conflictPolicy == ConflictPolicy.FAIL) {
            val (previousPointer, previous) = conflict
            throw OverlayConflictException(
                "Conflicting overlays at $pointer (overlaps $previousPointer): " +
                    "'${previous.overlayIdentity}' wrote ${previous.value}, '$overlayIdentity' wrote $value",
            )
        }
        writes[pointer] = RecordedWrite(overlayIdentity, value, destructive, allowsExactComposition)
    }

    private fun overlaps(
        left: String,
        right: String,
    ): Boolean = left == right || left.startsWith("$right/") || right.startsWith("$left/")

    private fun parseOverlay(input: OverlayInput): ParsedOverlay {
        val node = DocumentCodec.parse(input.content)
        if (!node.isObject) throw OverlayFormatException("Overlay '${input.identity}' must be an object")
        val version =
            node.path("overlay").takeIf(JsonNode::isTextual)?.asText()
                ?: throw OverlayFormatException("Overlay '${input.identity}' is missing textual 'overlay'")
        if (!version.startsWith("1.1.")) {
            throw OverlayFormatException(
                "Overlay '${input.identity}' uses unsupported version $version; expected 1.1.x",
            )
        }
        val info = node.path("info")
        val title =
            info.path("title").takeIf(JsonNode::isTextual)?.asText()
                ?: throw OverlayFormatException("Overlay '${input.identity}' is missing info.title")
        val metadataVersion =
            info.path("version").takeIf(JsonNode::isTextual)?.asText()
                ?: throw OverlayFormatException("Overlay '${input.identity}' is missing info.version")
        val actionsNode = node.path("actions")
        if (!actionsNode.isArray || actionsNode.isEmpty) {
            throw OverlayFormatException("Overlay '${input.identity}' must contain at least one action")
        }
        val actions =
            actionsNode.mapIndexed { index, action ->
                val target =
                    action.path("target").takeIf(JsonNode::isTextual)?.asText()
                        ?: throw OverlayFormatException("Overlay '${input.identity}' action $index is missing target")
                val copy =
                    action.get("copy")?.let { copyNode ->
                        if (!copyNode.isTextual) {
                            throw OverlayFormatException(
                                "Overlay '${input.identity}' action $index copy must be textual",
                            )
                        }
                        copyNode.asText()
                    }
                ParsedAction(
                    target = target,
                    update = action.get("update")?.deepCopy(),
                    copy = copy,
                    remove = action.path("remove").asBoolean(false),
                )
            }
        return ParsedOverlay(title, metadataVersion, actions)
    }

    private data class ParsedOverlay(
        val title: String,
        val version: String,
        val actions: List<ParsedAction>,
    )

    private data class ParsedAction(
        val target: String,
        val update: JsonNode?,
        val copy: String?,
        val remove: Boolean,
    )

    private data class RecordedWrite(
        val overlayIdentity: String,
        val value: String,
        val destructive: Boolean,
        val allowsExactComposition: Boolean,
    )
}
