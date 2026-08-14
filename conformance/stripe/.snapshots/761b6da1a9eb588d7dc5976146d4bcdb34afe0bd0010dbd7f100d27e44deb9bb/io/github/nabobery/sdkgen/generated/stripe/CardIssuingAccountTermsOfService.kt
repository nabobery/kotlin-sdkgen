package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/card_issuing_account_terms_of_service
 */
@Serializable(with = CardIssuingAccountTermsOfService.Serializer::class)
public class CardIssuingAccountTermsOfService(
  /**
   * The Unix timestamp marking when the account representative accepted the service agreement.
   */
  public val date: Int? = null,
  /**
   * The IP address from which the account representative accepted the service agreement.
   */
  public val ip: String? = null,
  /**
   * The user agent of the browser from which the account representative accepted the service agreement.
   */
  public val userAgent: String? = null,
) {
  public class Builder {
    /**
     * The Unix timestamp marking when the account representative accepted the service agreement.
     */
    public var date: Int? = null

    /**
     * The IP address from which the account representative accepted the service agreement.
     */
    public var ip: String? = null

    /**
     * The user agent of the browser from which the account representative accepted the service agreement.
     */
    public var userAgent: String? = null

    public fun build(): CardIssuingAccountTermsOfService = CardIssuingAccountTermsOfService(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CardIssuingAccountTermsOfService = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CardIssuingAccountTermsOfService> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CardIssuingAccountTermsOfService {
      val jsonDecoder = decoder.requireJsonDecoder("CardIssuingAccountTermsOfService")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CardIssuingAccountTermsOfService must be a JSON object")
      return CardIssuingAccountTermsOfService(
        date = rawObject["date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        ip = rawObject["ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CardIssuingAccountTermsOfService) {
      val jsonEncoder = encoder.requireJsonEncoder("CardIssuingAccountTermsOfService")
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

public fun cardIssuingAccountTermsOfService(block: CardIssuingAccountTermsOfService.Builder.() -> Unit): CardIssuingAccountTermsOfService = CardIssuingAccountTermsOfService.build(block)
