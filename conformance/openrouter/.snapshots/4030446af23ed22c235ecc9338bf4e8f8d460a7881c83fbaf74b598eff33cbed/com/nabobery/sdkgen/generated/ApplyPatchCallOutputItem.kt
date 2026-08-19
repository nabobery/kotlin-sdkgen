package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ApplyPatchCallOutputItemView(
  @SerialName("call_id")
  public val callId: String,
  public val id: String? = null,
  public val output: String? = null,
  public val status: InlineApplyPatchCallOutputItemStatusX79b31ade,
  public val type: InlineApplyPatchCallOutputItemTypeX5c4c3c3c,
)

/**
 * The client's echo of an `apply_patch_call` after applying the patch. `output` is an optional human-readable log;
 * `status` is `completed` when the patch was applied successfully, `failed` otherwise.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOutputItem
 */
@Serializable(with = ApplyPatchCallOutputItem.Serializer::class)
public class ApplyPatchCallOutputItem(
  public val callId: String,
  public val status: InlineApplyPatchCallOutputItemStatusX79b31ade,
  public val type: InlineApplyPatchCallOutputItemTypeX5c4c3c3c,
  public val id: String? = null,
  public val output: String? = null,
) {
  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var statusValue: InlineApplyPatchCallOutputItemStatusX79b31ade? = null

    public var status: InlineApplyPatchCallOutputItemStatusX79b31ade
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineApplyPatchCallOutputItemTypeX5c4c3c3c? = null

    public var type: InlineApplyPatchCallOutputItemTypeX5c4c3c3c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var output: String? = null

    public fun build(): ApplyPatchCallOutputItem {
      check(callIdValue != null) { "callId is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return ApplyPatchCallOutputItem(
        callId = callId,
        status = status,
        type = type,
        id = id,
        output = output,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchCallOutputItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ApplyPatchCallOutputItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchCallOutputItem {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchCallOutputItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ApplyPatchCallOutputItem must be a JSON object")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val status = json.decodeRequired<InlineApplyPatchCallOutputItemStatusX79b31ade>(rawObject, "status")
      val type = json.decodeRequired<InlineApplyPatchCallOutputItemTypeX5c4c3c3c>(rawObject, "type")
      return ApplyPatchCallOutputItem(
        callId = callId,
        status = status,
        type = type,
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        output = rawObject["output"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchCallOutputItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchCallOutputItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.output?.let { put("output", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applyPatchCallOutputItem(block: ApplyPatchCallOutputItem.Builder.() -> Unit): ApplyPatchCallOutputItem = ApplyPatchCallOutputItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ApplyPatchCallOutputItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
