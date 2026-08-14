package io.github.nabobery.sdkgen.generated

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
 * The `create_file` variant of an `apply_patch_call.operation`. Carries a V4A diff describing the new file contents.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCreateFileOperation
 */
@Serializable(with = ApplyPatchCreateFileOperation.Serializer::class)
public class ApplyPatchCreateFileOperation(
  public val diff: String,
  public val path: String,
  public val type: InlineApplyPatchCreateFileOperationTypeX0f95abc7,
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

    private var typeValue: InlineApplyPatchCreateFileOperationTypeX0f95abc7? = null

    public var type: InlineApplyPatchCreateFileOperationTypeX0f95abc7
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ApplyPatchCreateFileOperation {
      check(diffValue != null) { "diff is required" }
      check(pathValue != null) { "path is required" }
      check(typeValue != null) { "type is required" }
      return ApplyPatchCreateFileOperation(
        diff = diff,
        path = path,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchCreateFileOperation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ApplyPatchCreateFileOperation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchCreateFileOperation {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchCreateFileOperation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ApplyPatchCreateFileOperation must be a JSON object")
      val diff = json.decodeRequired<String>(rawObject, "diff")
      val path = json.decodeRequired<String>(rawObject, "path")
      val type = json.decodeRequired<InlineApplyPatchCreateFileOperationTypeX0f95abc7>(rawObject, "type")
      return ApplyPatchCreateFileOperation(
        diff = diff,
        path = path,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchCreateFileOperation) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchCreateFileOperation")
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

public fun applyPatchCreateFileOperation(block: ApplyPatchCreateFileOperation.Builder.() -> Unit): ApplyPatchCreateFileOperation = ApplyPatchCreateFileOperation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ApplyPatchCreateFileOperation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
