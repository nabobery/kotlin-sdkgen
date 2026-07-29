package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.squareup.kotlinpoet.CodeBlock

internal fun KotlinTypeRef.requiresOwnershipSnapshot(): Boolean =
    packageName == "kotlin.collections" && simpleName in setOf("List", "Set", "Map")

internal fun KotlinTypeRef.ownershipSnapshotExpression(
    valueName: String,
    nullable: Boolean = this.nullable,
): CodeBlock = ownershipSnapshotExpression(CodeBlock.of("%L", valueName), nullable, depth = 0)

private fun KotlinTypeRef.ownershipSnapshotExpression(
    value: CodeBlock,
    nullable: Boolean,
    depth: Int,
): CodeBlock {
    if (!requiresOwnershipSnapshot()) return value
    if (nullable) {
        val collectionName = "collection$depth"
        return CodeBlock.of(
            "%L?.let { %L -> %L }",
            value,
            collectionName,
            copyNonNullCollection(CodeBlock.of("%L", collectionName), depth + 1),
        )
    }
    return copyNonNullCollection(value, depth)
}

private fun KotlinTypeRef.copyNonNullCollection(
    value: CodeBlock,
    depth: Int,
): CodeBlock =
    when (simpleName) {
        "List" -> copyList(value, depth)
        "Set" -> copySet(value, depth)
        "Map" -> copyMap(value, depth)
        else -> error("Unsupported collection type $packageName.$simpleName")
    }

private fun KotlinTypeRef.copyList(
    value: CodeBlock,
    depth: Int,
): CodeBlock {
    val elementType = arguments.single()
    if (!elementType.requiresOwnershipSnapshot()) return CodeBlock.of("%L.toList()", value)
    val elementName = "element$depth"
    return CodeBlock.of(
        "%L.map { %L -> %L }",
        value,
        elementName,
        elementType.ownershipSnapshotExpression(
            CodeBlock.of("%L", elementName),
            nullable = elementType.nullable,
            depth = depth + 1,
        ),
    )
}

private fun KotlinTypeRef.copySet(
    value: CodeBlock,
    depth: Int,
): CodeBlock {
    val elementType = arguments.single()
    if (!elementType.requiresOwnershipSnapshot()) return CodeBlock.of("%L.toSet()", value)
    val elementName = "element$depth"
    return CodeBlock.of(
        "%L.mapTo(linkedSetOf()) { %L -> %L }",
        value,
        elementName,
        elementType.ownershipSnapshotExpression(
            CodeBlock.of("%L", elementName),
            nullable = elementType.nullable,
            depth = depth + 1,
        ),
    )
}

private fun KotlinTypeRef.copyMap(
    value: CodeBlock,
    depth: Int,
): CodeBlock {
    val (keyType, valueType) = arguments
    if (!keyType.requiresOwnershipSnapshot() && !valueType.requiresOwnershipSnapshot()) {
        return CodeBlock.of("%L.toMap()", value)
    }
    val keyName = "key$depth"
    val mapValueName = "mapValue$depth"
    return CodeBlock.of(
        "%L.entries.associate { (%L, %L) -> %L to %L }",
        value,
        keyName,
        mapValueName,
        keyType.ownershipSnapshotExpression(
            CodeBlock.of("%L", keyName),
            nullable = keyType.nullable,
            depth = depth + 1,
        ),
        valueType.ownershipSnapshotExpression(
            CodeBlock.of("%L", mapValueName),
            nullable = valueType.nullable,
            depth = depth + 1,
        ),
    )
}
