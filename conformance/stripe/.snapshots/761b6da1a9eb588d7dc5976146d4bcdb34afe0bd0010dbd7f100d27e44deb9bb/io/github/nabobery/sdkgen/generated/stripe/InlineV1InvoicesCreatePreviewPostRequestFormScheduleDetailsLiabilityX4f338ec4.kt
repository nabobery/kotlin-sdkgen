package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/automatic_tax/properties/liability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/automatic_tax/properties/liability
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4(
  public val type: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b? = null

    public var type: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4 {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4 must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b>(rawObject, "type")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsLiabilityX4f338ec4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
