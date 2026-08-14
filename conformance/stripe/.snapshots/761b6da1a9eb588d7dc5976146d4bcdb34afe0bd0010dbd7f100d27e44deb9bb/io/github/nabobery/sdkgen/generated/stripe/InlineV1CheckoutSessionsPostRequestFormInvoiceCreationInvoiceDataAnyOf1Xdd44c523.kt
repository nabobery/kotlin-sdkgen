package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523(
  public val amountTaxDisplay:
      InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAmountTaxDisplayX1d90323e? = null,
  public val template: String? = null,
) {
  public class Builder {
    public var amountTaxDisplay:
        InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAmountTaxDisplayX1d90323e? = null

    public var template: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523 = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523(
      amountTaxDisplay = amountTaxDisplay,
      template = template,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523(
        amountTaxDisplay = rawObject["amount_tax_display"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAmountTaxDisplayX1d90323e>(it) },
        template = rawObject["template"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountTaxDisplay?.let { put("amount_tax_display", json.encodeToJsonElement(it)) }
        value.template?.let { put("template", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523(block: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523 = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523.build(block)
