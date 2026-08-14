package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ConfirmationTokensResourcePaymentMethodOptionsResourceCardView(
  @SerialName("cvc_token")
  public val cvcToken: String? = null,
  public val installments:
      ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment? = null,
)

/**
 * This hash contains the card payment method options.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_payment_method_options_resource_card
 */
@Serializable(with = ConfirmationTokensResourcePaymentMethodOptionsResourceCard.Serializer::class)
public class ConfirmationTokensResourcePaymentMethodOptionsResourceCard(
  /**
   * The `cvc_update` Token collected from the Payment Element.
   */
  public val cvcToken: String? = null,
  public val installments:
      ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment? = null,
) {
  public class Builder {
    /**
     * The `cvc_update` Token collected from the Payment Element.
     */
    public var cvcToken: String? = null

    public var installments:
        ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment? = null

    public fun build(): ConfirmationTokensResourcePaymentMethodOptionsResourceCard = ConfirmationTokensResourcePaymentMethodOptionsResourceCard(
      cvcToken = cvcToken,
      installments = installments,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConfirmationTokensResourcePaymentMethodOptionsResourceCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConfirmationTokensResourcePaymentMethodOptionsResourceCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConfirmationTokensResourcePaymentMethodOptionsResourceCard {
      val jsonDecoder = decoder.requireJsonDecoder("ConfirmationTokensResourcePaymentMethodOptionsResourceCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConfirmationTokensResourcePaymentMethodOptionsResourceCard must be a JSON object")
      return ConfirmationTokensResourcePaymentMethodOptionsResourceCard(
        cvcToken = rawObject["cvc_token"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<ConfirmationTokensResourcePaymentMethodOptionsResourceCardResourceInstallment>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConfirmationTokensResourcePaymentMethodOptionsResourceCard) {
      val jsonEncoder = encoder.requireJsonEncoder("ConfirmationTokensResourcePaymentMethodOptionsResourceCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cvcToken?.let { put("cvc_token", it) }
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun confirmationTokensResourcePaymentMethodOptionsResourceCard(block: ConfirmationTokensResourcePaymentMethodOptionsResourceCard.Builder.() -> Unit): ConfirmationTokensResourcePaymentMethodOptionsResourceCard = ConfirmationTokensResourcePaymentMethodOptionsResourceCard.build(block)
