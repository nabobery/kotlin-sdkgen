package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class InvoicePaymentMethodOptionsUpiView(
  @SerialName("mandate_options")
  public val mandateOptions: InvoicePaymentMethodOptionsMandateOptionsUpi? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_upi
 */
@Serializable(with = InvoicePaymentMethodOptionsUpi.Serializer::class)
public class InvoicePaymentMethodOptionsUpi(
  public val mandateOptions: InvoicePaymentMethodOptionsMandateOptionsUpi? = null,
) {
  public class Builder {
    public var mandateOptions: InvoicePaymentMethodOptionsMandateOptionsUpi? = null

    public fun build(): InvoicePaymentMethodOptionsUpi = InvoicePaymentMethodOptionsUpi(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsUpi = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicePaymentMethodOptionsUpi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsUpi {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsUpi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsUpi must be a JSON object")
      return InvoicePaymentMethodOptionsUpi(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InvoicePaymentMethodOptionsMandateOptionsUpi>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsUpi) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsUpi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsUpi(block: InvoicePaymentMethodOptionsUpi.Builder.() -> Unit): InvoicePaymentMethodOptionsUpi = InvoicePaymentMethodOptionsUpi.build(block)
