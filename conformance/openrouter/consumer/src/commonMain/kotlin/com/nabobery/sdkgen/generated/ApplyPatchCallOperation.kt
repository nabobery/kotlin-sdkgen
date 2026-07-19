package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

public sealed class ApplyPatchCallOperationDecodingException(
  message: String,
) : SerializationException(message)

public class ApplyPatchCallOperationNoMatchException(
  message: String,
) : ApplyPatchCallOperationDecodingException(message)

public class ApplyPatchCallOperationAmbiguityException(
  message: String,
) : ApplyPatchCallOperationDecodingException(message)

/**
 * The patch operation requested by an `apply_patch_call`. `create_file` and `update_file` carry a V4A diff;
 * `delete_file` omits it.
 */
@Serializable(with = ApplyPatchCallOperation.Serializer::class)
public sealed interface ApplyPatchCallOperation {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ApplyPatchCreateFileOperation internal constructor(
    public val diff: String,
    public val path: String,
    public val type: InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ApplyPatchCallOperation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        diff: String,
        path: String,
        type: InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType,
      ): ApplyPatchCreateFileOperation = ApplyPatchCreateFileOperation(
        diff = diff,
        path = path,
        type = type,
        raw = buildJsonObject {
          put("diff", diff)
          put("path", path)
          put("type", "create_file")
        },
      )
    }
  }

  public class ApplyPatchUpdateFileOperation internal constructor(
    public val diff: String,
    public val path: String,
    public val type: InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ApplyPatchCallOperation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        diff: String,
        path: String,
        type: InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType,
      ): ApplyPatchUpdateFileOperation = ApplyPatchUpdateFileOperation(
        diff = diff,
        path = path,
        type = type,
        raw = buildJsonObject {
          put("diff", diff)
          put("path", path)
          put("type", "update_file")
        },
      )
    }
  }

  public class ApplyPatchDeleteFileOperation internal constructor(
    public val path: String,
    public val type: InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ApplyPatchCallOperation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(path: String,
        type: InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType): ApplyPatchDeleteFileOperation =
          ApplyPatchDeleteFileOperation(
        path = path,
        type = type,
        raw = buildJsonObject {
          put("path", path)
          put("type", "delete_file")
        },
      )
    }
  }

  public object Serializer : KSerializer<ApplyPatchCallOperation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchCallOperation {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchCallOperation")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw ApplyPatchCallOperationNoMatchException("ApplyPatchCallOperation matched 0 branches: expected JSON " +
          "object")
      val matches = inspectApplyPatchCallOperation(raw)
      if (matches.size == 0) {
        throw ApplyPatchCallOperationNoMatchException("ApplyPatchCallOperation matched 0 branches: " + matches.failures
          .joinToString("; "))
      }
      if (matches.size > 1) {
        throw ApplyPatchCallOperationAmbiguityException("ApplyPatchCallOperation matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Matches && matches.diffDecoded && matches.pathDecoded -> ApplyPatchCreateFileOperation(diff =
          requireNotNull(matches.diff), path = requireNotNull(matches.path), type = requireNotNull(matches.typeState1),
            raw = raw)
        matches.typeState3Matches && matches.diffDecoded && matches.pathDecoded -> ApplyPatchUpdateFileOperation(diff =
          requireNotNull(matches.diff), path = requireNotNull(matches.path), type = requireNotNull(matches.typeState3),
            raw = raw)
        matches.typeState2Matches && matches.pathDecoded -> ApplyPatchDeleteFileOperation(path = requireNotNull(matches
          .path), type = requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchCallOperation) {
      encoder.requireJsonEncoder("ApplyPatchCallOperation").encodeJsonElement(value.raw)
    }
  }
}

private data class ApplyPatchCallOperationInspection(
  public val typeState1: InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val diff: String?,
  public val diffDecoded: Boolean,
  public val path: String?,
  public val pathDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val typeState2: InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState1Matches && diffDecoded && pathDecoded) add("ApplyPatchCreateFileOperation")
      if (typeState3Matches && diffDecoded && pathDecoded) add("ApplyPatchUpdateFileOperation")
      if (typeState2Matches && pathDecoded) add("ApplyPatchDeleteFileOperation")
    }

  public val size: Int
    get() = names.size
}

private fun inspectApplyPatchCallOperation(raw: JsonObject): ApplyPatchCallOperationInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "create_file" && typeState1Decoded
  val diffResult = raw["diff"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val diff = diffResult?.getOrNull()
  val diffDecoded = diffResult?.isSuccess == true
  val pathResult = raw["path"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val path = pathResult?.getOrNull()
  val pathDecoded = pathResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "update_file" && typeState3Decoded
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "delete_file" && typeState2Decoded
  return ApplyPatchCallOperationInspection(
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    diff = diff,
    diffDecoded = diffDecoded,
    path = path,
    pathDecoded = pathDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    failures = buildList {
      if (!typeState1Matches || !diffDecoded ||
        !pathDecoded) add("ApplyPatchCreateFileOperation: required properties 'type' and 'diff' and 'path' do not " +
          "match their declared types")
      if (!typeState3Matches || !diffDecoded ||
        !pathDecoded) add("ApplyPatchUpdateFileOperation: required properties 'type' and 'diff' and 'path' do not " +
          "match their declared types")
      if (!typeState2Matches ||
        !pathDecoded) add("ApplyPatchDeleteFileOperation: required properties 'type' and 'path' do not match their " +
          "declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
