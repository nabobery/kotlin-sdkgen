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
import kotlinx.serialization.json.put

@Serializable
public data class ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnlineView(
  @SerialName("ip_address")
  public val ipAddress: String? = null,
  @SerialName("user_agent")
  public val userAgent: String? = null,
)

/**
 * This hash contains details about the online acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_mandate_data_resource_customer_acceptan
 * ce_resource_online
 */
@Serializable(with = ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline.Serializer::class)
public class ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline(
  /**
   * The IP address from which the Mandate was accepted by the customer.
   */
  public val ipAddress: String? = null,
  /**
   * The user agent of the browser from which the Mandate was accepted by the customer.
   */
  public val userAgent: String? = null,
) {
  public class Builder {
    /**
     * The IP address from which the Mandate was accepted by the customer.
     */
    public var ipAddress: String? = null

    /**
     * The user agent of the browser from which the Mandate was accepted by the customer.
     */
    public var userAgent: String? = null

    public fun build(): ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline = ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline(
      ipAddress = ipAddress,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline {
      val jsonDecoder = decoder.requireJsonDecoder("ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline must be a JSON object")
      return ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline(
        ipAddress = rawObject["ip_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        userAgent = rawObject["user_agent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline) {
      val jsonEncoder = encoder.requireJsonEncoder("ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ipAddress?.let { put("ip_address", it) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun confirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline(block: ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline.Builder.() -> Unit): ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline = ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline.build(block)
