package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The `update_file` variant of an `apply_patch_call.operation`. Carries a V4A diff describing edits to an existing
 * file.
 */
@Serializable(with = ApplyPatchUpdateFileOperation.Serializer::class)
public class ApplyPatchUpdateFileOperation(
  public val diff: String,
  public val path: String,
  public val type: InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType,
) {
  public class Builder {
    private var diffValue: String? = null

    public var diff: String
      get() = requireNotNull(diffValue) { "diff is required" }
      set(`value`) {
        diffValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var typeValue: InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType? =
        null

    public var type: InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ApplyPatchUpdateFileOperation {
      check(diffValue != null) { "diff is required" }
      check(pathValue != null) { "path is required" }
      check(typeValue != null) { "type is required" }
      return ApplyPatchUpdateFileOperation(
        diff = diff,
        path = path,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchUpdateFileOperation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ApplyPatchUpdateFileOperation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchUpdateFileOperation {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchUpdateFileOperation")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ApplyPatchUpdateFileOperation must be a JSON object")
      val diff = json.decodeRequired<String>(raw, "diff")
      val path = json.decodeRequired<String>(raw, "path")
      val type = json.decodeRequired<InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType>(raw, "type")
      return ApplyPatchUpdateFileOperation(
        diff = diff,
        path = path,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchUpdateFileOperation) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchUpdateFileOperation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("diff", value.diff)
        put("path", value.path)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applyPatchUpdateFileOperation(block: ApplyPatchUpdateFileOperation.Builder.() ->
  Unit): ApplyPatchUpdateFileOperation = ApplyPatchUpdateFileOperation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ApplyPatchUpdateFileOperation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
