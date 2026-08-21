package com.nabobery.sdkgen.generated.stripe

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
public data class IssuingCardholderIndividualView(
  @SerialName("card_issuing")
  public val cardIssuing: InlineIssuingCardholderIndividualCardIssuingX688395c8? = null,
  public val dob: InlineIssuingCardholderIndividualDobX7050b088? = null,
  @SerialName("first_name")
  public val firstName: String? = null,
  @SerialName("last_name")
  public val lastName: String? = null,
  public val verification: InlineIssuingCardholderIndividualVerificationX227614f2? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_individual
 */
@Serializable(with = IssuingCardholderIndividual.Serializer::class)
public class IssuingCardholderIndividual(
  /**
   * Information related to the card_issuing program for this cardholder.
   */
  public val cardIssuing: InlineIssuingCardholderIndividualCardIssuingX688395c8? = null,
  /**
   * The date of birth of this cardholder.
   */
  public val dob: InlineIssuingCardholderIndividualDobX7050b088? = null,
  /**
   * The first name of this cardholder. Required before activating Cards. This field cannot contain any numbers, special
   * characters (except periods, commas, hyphens, spaces and apostrophes) or non-latin letters.
   */
  public val firstName: String? = null,
  /**
   * The last name of this cardholder. Required before activating Cards. This field cannot contain any numbers, special
   * characters (except periods, commas, hyphens, spaces and apostrophes) or non-latin letters.
   */
  public val lastName: String? = null,
  /**
   * Government-issued ID document for this cardholder.
   */
  public val verification: InlineIssuingCardholderIndividualVerificationX227614f2? = null,
) {
  public class Builder {
    /**
     * Information related to the card_issuing program for this cardholder.
     */
    public var cardIssuing: InlineIssuingCardholderIndividualCardIssuingX688395c8? = null

    /**
     * The date of birth of this cardholder.
     */
    public var dob: InlineIssuingCardholderIndividualDobX7050b088? = null

    /**
     * The first name of this cardholder. Required before activating Cards. This field cannot contain any numbers,
     * special characters (except periods, commas, hyphens, spaces and apostrophes) or non-latin letters.
     */
    public var firstName: String? = null

    /**
     * The last name of this cardholder. Required before activating Cards. This field cannot contain any numbers,
     * special characters (except periods, commas, hyphens, spaces and apostrophes) or non-latin letters.
     */
    public var lastName: String? = null

    /**
     * Government-issued ID document for this cardholder.
     */
    public var verification: InlineIssuingCardholderIndividualVerificationX227614f2? = null

    public fun build(): IssuingCardholderIndividual = IssuingCardholderIndividual(
      cardIssuing = cardIssuing,
      dob = dob,
      firstName = firstName,
      lastName = lastName,
      verification = verification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholderIndividual = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingCardholderIndividual> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholderIndividual {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderIndividual")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholderIndividual must be a JSON object")
      return IssuingCardholderIndividual(
        cardIssuing = rawObject["card_issuing"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderIndividualCardIssuingX688395c8?>(element) },
        dob = rawObject["dob"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderIndividualDobX7050b088?>(element) },
        firstName = rawObject["first_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastName = rawObject["last_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        verification = rawObject["verification"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderIndividualVerificationX227614f2?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholderIndividual) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderIndividual")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardIssuing?.let { put("card_issuing", json.encodeToJsonElement(it)) }
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.firstName?.let { put("first_name", it) }
        value.lastName?.let { put("last_name", it) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholderIndividual(block: IssuingCardholderIndividual.Builder.() -> Unit): IssuingCardholderIndividual = IssuingCardholderIndividual.build(block)
