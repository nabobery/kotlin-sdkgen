package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
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
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_number_details
 */
@Serializable(with = BankConnectionsResourceAccountNumberDetails.Serializer::class)
public class BankConnectionsResourceAccountNumberDetails(
  /**
   * The type of account number associated with the account.
   */
  public val identifierType:
      InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d,
  /**
   * Whether the account number is currently active and usable for transactions.
   */
  public val status: InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea,
  supportedNetworks: List<InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c>,
  /**
   * When the account number is expected to expire, if applicable.
   */
  public val expectedExpiryDate: Int? = null,
) {
  /**
   * The payment networks that the account number can be used for.
   */
  public val supportedNetworks:
      List<InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c> =
      supportedNetworks.toList()

  public class Builder {
    private var identifierTypeValue:
        InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d? = null

    public var identifierType:
        InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d
      get() = requireNotNull(identifierTypeValue) { "identifierType is required" }
      set(`value`) {
        identifierTypeValue = value
      }

    private var statusValue: InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea? =
        null

    public var status: InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var supportedNetworksValue:
        List<InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c>? =
        null

    public var supportedNetworks:
        List<InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c>
      get() = requireNotNull(supportedNetworksValue) { "supportedNetworks is required" }.toList()
      set(`value`) {
        supportedNetworksValue = value.toList()
      }

    /**
     * When the account number is expected to expire, if applicable.
     */
    public var expectedExpiryDate: Int? = null

    public fun build(): BankConnectionsResourceAccountNumberDetails {
      check(identifierTypeValue != null) { "identifierType is required" }
      check(statusValue != null) { "status is required" }
      check(supportedNetworksValue != null) { "supportedNetworks is required" }
      return BankConnectionsResourceAccountNumberDetails(
        identifierType = identifierType,
        status = status,
        supportedNetworks = supportedNetworks,
        expectedExpiryDate = expectedExpiryDate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceAccountNumberDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BankConnectionsResourceAccountNumberDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceAccountNumberDetails {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceAccountNumberDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceAccountNumberDetails must be a JSON object")
      val identifierType = json.decodeRequired<InlineBankConnectionsResourceAccountNumberDetailsIdentifierTypeX848bc84d>(rawObject, "identifier_type")
      val status = json.decodeRequired<InlineBankConnectionsResourceAccountNumberDetailsStatusX0a0ad0ea>(rawObject, "status")
      val supportedNetworks = json.decodeRequired<List<InlineBankConnectionsResourceAccountNumberDetailsSupportedNetworksItemX35e7579c>>(rawObject, "supported_networks")
      return BankConnectionsResourceAccountNumberDetails(
        identifierType = identifierType,
        status = status,
        supportedNetworks = supportedNetworks,
        expectedExpiryDate = rawObject["expected_expiry_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceAccountNumberDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceAccountNumberDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("identifier_type", json.encodeToJsonElement(value.identifierType))
        put("status", json.encodeToJsonElement(value.status))
        put("supported_networks", json.encodeToJsonElement(value.supportedNetworks))
        value.expectedExpiryDate?.let { put("expected_expiry_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceAccountNumberDetails(block: BankConnectionsResourceAccountNumberDetails.Builder.() -> Unit): BankConnectionsResourceAccountNumberDetails = BankConnectionsResourceAccountNumberDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BankConnectionsResourceAccountNumberDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
