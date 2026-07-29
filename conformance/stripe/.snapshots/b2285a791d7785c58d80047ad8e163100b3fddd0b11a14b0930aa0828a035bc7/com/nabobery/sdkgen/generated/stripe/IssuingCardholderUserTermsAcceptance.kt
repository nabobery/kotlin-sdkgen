package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
public data class IssuingCardholderUserTermsAcceptanceView(
  public val date: Int? = null,
  public val ip: String? = null,
  @SerialName("user_agent")
  public val userAgent: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_user_terms_acceptance
 */
@Serializable(with = IssuingCardholderUserTermsAcceptance.Serializer::class)
public class IssuingCardholderUserTermsAcceptance(
  /**
   * The Unix timestamp marking when the cardholder accepted the Authorized User Terms.
   */
  public val date: Int? = null,
  /**
   * The IP address from which the cardholder accepted the Authorized User Terms.
   */
  public val ip: String? = null,
  /**
   * The user agent of the browser from which the cardholder accepted the Authorized User Terms.
   */
  public val userAgent: String? = null,
) {
  public class Builder {
    /**
     * The Unix timestamp marking when the cardholder accepted the Authorized User Terms.
     */
    public var date: Int? = null

    /**
     * The IP address from which the cardholder accepted the Authorized User Terms.
     */
    public var ip: String? = null

    /**
     * The user agent of the browser from which the cardholder accepted the Authorized User Terms.
     */
    public var userAgent: String? = null

    public fun build(): IssuingCardholderUserTermsAcceptance = IssuingCardholderUserTermsAcceptance(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholderUserTermsAcceptance = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardholderUserTermsAcceptance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholderUserTermsAcceptance {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderUserTermsAcceptance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholderUserTermsAcceptance must be a JSON object")
      return IssuingCardholderUserTermsAcceptance(
        date = rawObject["date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        ip = rawObject["ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        userAgent = rawObject["user_agent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholderUserTermsAcceptance) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderUserTermsAcceptance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", json.encodeToJsonElement(it)) }
        value.ip?.let { put("ip", it) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholderUserTermsAcceptance(block: IssuingCardholderUserTermsAcceptance.Builder.() -> Unit): IssuingCardholderUserTermsAcceptance = IssuingCardholderUserTermsAcceptance.build(block)
