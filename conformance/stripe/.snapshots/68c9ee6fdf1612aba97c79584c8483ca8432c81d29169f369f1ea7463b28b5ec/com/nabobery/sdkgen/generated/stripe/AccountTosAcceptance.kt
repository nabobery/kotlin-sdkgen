package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_tos_acceptance
 */
@Serializable(with = AccountTosAcceptance.Serializer::class)
public class AccountTosAcceptance(
  /**
   * The Unix timestamp marking when the account representative accepted their service agreement
   */
  public val date: Int? = null,
  /**
   * The IP address from which the account representative accepted their service agreement
   */
  public val ip: String? = null,
  /**
   * The user's service agreement type
   */
  public val serviceAgreement: String? = null,
  /**
   * The user agent of the browser from which the account representative accepted their service agreement
   */
  public val userAgent: String? = null,
) {
  public class Builder {
    /**
     * The Unix timestamp marking when the account representative accepted their service agreement
     */
    public var date: Int? = null

    /**
     * The IP address from which the account representative accepted their service agreement
     */
    public var ip: String? = null

    /**
     * The user's service agreement type
     */
    public var serviceAgreement: String? = null

    /**
     * The user agent of the browser from which the account representative accepted their service agreement
     */
    public var userAgent: String? = null

    public fun build(): AccountTosAcceptance = AccountTosAcceptance(
      date = date,
      ip = ip,
      serviceAgreement = serviceAgreement,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountTosAcceptance = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountTosAcceptance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountTosAcceptance {
      val jsonDecoder = decoder.requireJsonDecoder("AccountTosAcceptance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountTosAcceptance must be a JSON object")
      return AccountTosAcceptance(
        date = rawObject["date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        ip = rawObject["ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        serviceAgreement = rawObject["service_agreement"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountTosAcceptance) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountTosAcceptance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", json.encodeToJsonElement(it)) }
        value.ip?.let { put("ip", it) }
        value.serviceAgreement?.let { put("service_agreement", it) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountTosAcceptance(block: AccountTosAcceptance.Builder.() -> Unit): AccountTosAcceptance = AccountTosAcceptance.build(block)
