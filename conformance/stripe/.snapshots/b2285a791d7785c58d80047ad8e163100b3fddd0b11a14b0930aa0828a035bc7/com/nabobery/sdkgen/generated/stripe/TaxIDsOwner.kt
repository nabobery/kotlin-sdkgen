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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TaxIDsOwnerView(
  public val account: InlineTaxIDsOwnerAccountX1491eced? = null,
  public val application: InlineTaxIDsOwnerApplicationXe5bdf86c? = null,
  public val customer: InlineTaxIDsOwnerCustomerXa297aa4e? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  public val type: InlineTaxIDsOwnerTypeXb1bf3e21,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_i_ds_owner
 */
@Serializable(with = TaxIDsOwner.Serializer::class)
public class TaxIDsOwner(
  /**
   * Type of owner referenced.
   */
  public val type: InlineTaxIDsOwnerTypeXb1bf3e21,
  /**
   * The account being referenced when `type` is `account`.
   */
  public val account: InlineTaxIDsOwnerAccountX1491eced? = null,
  /**
   * The Connect Application being referenced when `type` is `application`.
   */
  public val application: InlineTaxIDsOwnerApplicationXe5bdf86c? = null,
  /**
   * The customer being referenced when `type` is `customer`.
   */
  public val customer: InlineTaxIDsOwnerCustomerXa297aa4e? = null,
  /**
   * The Account representing the customer being referenced when `type` is `customer`.
   */
  public val customerAccount: String? = null,
) {
  public class Builder {
    private var typeValue: InlineTaxIDsOwnerTypeXb1bf3e21? = null

    public var type: InlineTaxIDsOwnerTypeXb1bf3e21
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The account being referenced when `type` is `account`.
     */
    public var account: InlineTaxIDsOwnerAccountX1491eced? = null

    /**
     * The Connect Application being referenced when `type` is `application`.
     */
    public var application: InlineTaxIDsOwnerApplicationXe5bdf86c? = null

    /**
     * The customer being referenced when `type` is `customer`.
     */
    public var customer: InlineTaxIDsOwnerCustomerXa297aa4e? = null

    /**
     * The Account representing the customer being referenced when `type` is `customer`.
     */
    public var customerAccount: String? = null

    public fun build(): TaxIDsOwner {
      check(typeValue != null) { "type is required" }
      return TaxIDsOwner(
        type = type,
        account = account,
        application = application,
        customer = customer,
        customerAccount = customerAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxIDsOwner = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxIDsOwner> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxIDsOwner {
      val jsonDecoder = decoder.requireJsonDecoder("TaxIDsOwner")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxIDsOwner must be a JSON object")
      val type = json.decodeRequired<InlineTaxIDsOwnerTypeXb1bf3e21>(rawObject, "type")
      return TaxIDsOwner(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<InlineTaxIDsOwnerAccountX1491eced>(it) },
        application = rawObject["application"]?.let { json.decodeFromJsonElement<InlineTaxIDsOwnerApplicationXe5bdf86c>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<InlineTaxIDsOwnerCustomerXa297aa4e>(it) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxIDsOwner) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxIDsOwner")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", json.encodeToJsonElement(it)) }
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxIDsOwner(block: TaxIDsOwner.Builder.() -> Unit): TaxIDsOwner = TaxIDsOwner.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxIDsOwner is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
