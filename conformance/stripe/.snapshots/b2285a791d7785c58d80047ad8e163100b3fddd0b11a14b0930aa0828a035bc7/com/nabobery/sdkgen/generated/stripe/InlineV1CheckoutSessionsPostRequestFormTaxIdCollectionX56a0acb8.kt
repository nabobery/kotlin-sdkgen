package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Controls tax ID collection during checkout.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/tax_id_collection
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8(
  public val enabled: Boolean,
  public val required:
      InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionRequiredXe24ca6d9? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var required: InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionRequiredXe24ca6d9? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8(
        enabled = enabled,
        required = required,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8(
        enabled = enabled,
        required = rawObject["required"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionRequiredXe24ca6d9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.required?.let { put("required", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8(block: InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8 = InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
