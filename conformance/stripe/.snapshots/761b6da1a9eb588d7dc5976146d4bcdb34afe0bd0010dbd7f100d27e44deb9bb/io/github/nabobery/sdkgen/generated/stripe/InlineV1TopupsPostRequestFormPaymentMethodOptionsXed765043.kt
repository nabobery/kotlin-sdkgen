package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Payment method-specific configuration for this top-up.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1topups/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/payment_method_options
 */
@Serializable(with = InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043.Serializer::class)
public class InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043(
  public val usBankAccount:
      InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06? = null,
) {
  public class Builder {
    public var usBankAccount:
        InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06? = null

    public fun build(): InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043 = InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043(
      usBankAccount = usBankAccount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043 must be a JSON object")
      return InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043(
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043(block: InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043.Builder.() -> Unit): InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043 = InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043.build(block)
