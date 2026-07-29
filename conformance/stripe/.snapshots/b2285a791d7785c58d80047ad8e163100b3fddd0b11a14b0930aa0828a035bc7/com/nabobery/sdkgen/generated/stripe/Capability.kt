package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * This is an object representing a capability for a Stripe account.
 *
 * Related guide: [Account capabilities](https://docs.stripe.com/connect/account-capabilities)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/capability
 */
@Serializable(with = Capability.Serializer::class)
public class Capability(
  /**
   * The account for which the capability enables functionality.
   */
  public val account: InlineCapabilityAccountXd948559c,
  /**
   * The identifier for the capability.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCapabilityObjectValueX681bd393,
  /**
   * Whether the capability has been requested.
   */
  public val requested: Boolean,
  /**
   * The status of the capability.
   */
  public val status: InlineCapabilityStatusX7c7eeca5,
  public val futureRequirements: AccountCapabilityFutureRequirements? = null,
  /**
   * Time at which the capability was requested. Measured in seconds since the Unix epoch.
   */
  public val requestedAt: Int? = null,
  public val requirements: AccountCapabilityRequirements? = null,
) {
  public class Builder {
    private var accountValue: InlineCapabilityAccountXd948559c? = null

    public var account: InlineCapabilityAccountXd948559c
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineCapabilityObjectValueX681bd393? = null

    public var objectValue: InlineCapabilityObjectValueX681bd393
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var requestedValue: Boolean? = null

    public var requested: Boolean
      get() = requireNotNull(requestedValue) { "requested is required" }
      set(`value`) {
        requestedValue = value
      }

    private var statusValue: InlineCapabilityStatusX7c7eeca5? = null

    public var status: InlineCapabilityStatusX7c7eeca5
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public var futureRequirements: AccountCapabilityFutureRequirements? = null

    /**
     * Time at which the capability was requested. Measured in seconds since the Unix epoch.
     */
    public var requestedAt: Int? = null

    public var requirements: AccountCapabilityRequirements? = null

    public fun build(): Capability {
      check(accountValue != null) { "account is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(requestedValue != null) { "requested is required" }
      check(statusValue != null) { "status is required" }
      return Capability(
        account = account,
        id = id,
        objectValue = objectValue,
        requested = requested,
        status = status,
        futureRequirements = futureRequirements,
        requestedAt = requestedAt,
        requirements = requirements,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Capability = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Capability> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Capability {
      val jsonDecoder = decoder.requireJsonDecoder("Capability")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Capability must be a JSON object")
      val account = json.decodeRequired<InlineCapabilityAccountXd948559c>(rawObject, "account")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineCapabilityObjectValueX681bd393>(rawObject, "object")
      val requested = json.decodeRequired<Boolean>(rawObject, "requested")
      val status = json.decodeRequired<InlineCapabilityStatusX7c7eeca5>(rawObject, "status")
      return Capability(
        account = account,
        id = id,
        objectValue = objectValue,
        requested = requested,
        status = status,
        futureRequirements = rawObject["future_requirements"]?.let { json.decodeFromJsonElement<AccountCapabilityFutureRequirements>(it) },
        requestedAt = rawObject["requested_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        requirements = rawObject["requirements"]?.let { json.decodeFromJsonElement<AccountCapabilityRequirements>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Capability) {
      val jsonEncoder = encoder.requireJsonEncoder("Capability")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("requested", json.encodeToJsonElement(value.requested))
        put("status", json.encodeToJsonElement(value.status))
        value.futureRequirements?.let { put("future_requirements", json.encodeToJsonElement(it)) }
        value.requestedAt?.let { put("requested_at", json.encodeToJsonElement(it)) }
        value.requirements?.let { put("requirements", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun capability(block: Capability.Builder.() -> Unit): Capability = Capability.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Capability is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
