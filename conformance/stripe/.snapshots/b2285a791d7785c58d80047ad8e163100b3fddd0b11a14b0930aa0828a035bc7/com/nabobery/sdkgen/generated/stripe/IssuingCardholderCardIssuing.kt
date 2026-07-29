package com.nabobery.sdkgen.generated.stripe

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
public data class IssuingCardholderCardIssuingView(
  @SerialName("user_terms_acceptance")
  public val userTermsAcceptance:
      InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_card_issuing
 */
@Serializable(with = IssuingCardholderCardIssuing.Serializer::class)
public class IssuingCardholderCardIssuing(
  /**
   * Information about cardholder acceptance of Celtic [Authorized User
   * Terms](https://stripe.com/docs/issuing/cards#accept-authorized-user-terms). Required for cards backed by a Celtic
   * program.
   */
  public val userTermsAcceptance:
      InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48? = null,
) {
  public class Builder {
    /**
     * Information about cardholder acceptance of Celtic [Authorized User
     * Terms](https://stripe.com/docs/issuing/cards#accept-authorized-user-terms). Required for cards backed by a Celtic
     * program.
     */
    public var userTermsAcceptance: InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48?
        = null

    public fun build(): IssuingCardholderCardIssuing = IssuingCardholderCardIssuing(
      userTermsAcceptance = userTermsAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholderCardIssuing = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardholderCardIssuing> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholderCardIssuing {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderCardIssuing")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholderCardIssuing must be a JSON object")
      return IssuingCardholderCardIssuing(
        userTermsAcceptance = rawObject["user_terms_acceptance"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholderCardIssuing) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderCardIssuing")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.userTermsAcceptance?.let { put("user_terms_acceptance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholderCardIssuing(block: IssuingCardholderCardIssuing.Builder.() -> Unit): IssuingCardholderCardIssuing = IssuingCardholderCardIssuing.build(block)
