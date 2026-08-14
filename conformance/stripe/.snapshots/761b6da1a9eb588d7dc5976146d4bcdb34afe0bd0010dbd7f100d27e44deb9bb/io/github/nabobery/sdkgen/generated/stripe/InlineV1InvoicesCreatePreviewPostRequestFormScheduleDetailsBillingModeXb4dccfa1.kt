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
 * rlencoded/schema/properties/schedule_details/properties/billing_mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/billing_mode
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1(
  public val type: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d,
  public val flexible:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2? = null,
) {
  public class Builder {
    private var typeValue: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d?
        = null

    public var type: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var flexible:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1 {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1(
        type = type,
        flexible = flexible,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1 must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d>(rawObject, "type")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1(
        type = type,
        flexible = rawObject["flexible"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsFlexibleXe8966bb2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
