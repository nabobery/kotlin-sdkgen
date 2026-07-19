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
 * The `delete_file` variant of an `apply_patch_call.operation`. Identifies the file to remove; no diff is required.
 */
@Serializable(with = ApplyPatchDeleteFileOperation.Serializer::class)
public class ApplyPatchDeleteFileOperation(
  public val path: String,
  public val type: InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType,
) {
  public class Builder {
    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var typeValue: InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType? =
        null

    public var type: InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ApplyPatchDeleteFileOperation {
      check(pathValue != null) { "path is required" }
      check(typeValue != null) { "type is required" }
      return ApplyPatchDeleteFileOperation(
        path = path,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchDeleteFileOperation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ApplyPatchDeleteFileOperation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchDeleteFileOperation {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchDeleteFileOperation")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ApplyPatchDeleteFileOperation must be a JSON object")
      val path = json.decodeRequired<String>(raw, "path")
      val type = json.decodeRequired<InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType>(raw, "type")
      return ApplyPatchDeleteFileOperation(
        path = path,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchDeleteFileOperation) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchDeleteFileOperation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("path", value.path)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applyPatchDeleteFileOperation(block: ApplyPatchDeleteFileOperation.Builder.() ->
  Unit): ApplyPatchDeleteFileOperation = ApplyPatchDeleteFileOperation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ApplyPatchDeleteFileOperation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
