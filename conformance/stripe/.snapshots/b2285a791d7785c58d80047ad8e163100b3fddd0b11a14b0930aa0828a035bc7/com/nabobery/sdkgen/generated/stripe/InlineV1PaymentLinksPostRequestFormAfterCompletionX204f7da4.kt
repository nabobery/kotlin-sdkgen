package com.nabobery.sdkgen.generated.stripe

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
 * Behavior after the purchase is complete.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/after_completion
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4(
  public val type: InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19,
  public val hostedConfirmation:
      InlineV1PaymentLinksPostRequestFormAfterCompletionHostedConfirmationX45d9cb84? = null,
  public val redirect: InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9? = null,
) {
  public class Builder {
    private var typeValue: InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19? = null

    public var type: InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var hostedConfirmation:
        InlineV1PaymentLinksPostRequestFormAfterCompletionHostedConfirmationX45d9cb84? = null

    public var redirect: InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4 {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4(
        type = type,
        hostedConfirmation = hostedConfirmation,
        redirect = redirect,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4 must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentLinksPostRequestFormAfterCompletionTypeXa04bab19>(rawObject, "type")
      return InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4(
        type = type,
        hostedConfirmation = rawObject["hosted_confirmation"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAfterCompletionHostedConfirmationX45d9cb84>(it) },
        redirect = rawObject["redirect"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAfterCompletionRedirectXd22810e9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.hostedConfirmation?.let { put("hosted_confirmation", json.encodeToJsonElement(it)) }
        value.redirect?.let { put("redirect", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4(block: InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4 = InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
