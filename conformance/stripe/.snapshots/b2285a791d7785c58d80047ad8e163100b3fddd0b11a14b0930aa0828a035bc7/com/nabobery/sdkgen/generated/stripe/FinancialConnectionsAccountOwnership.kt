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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class FinancialConnectionsAccountOwnershipView(
  public val created: Int,
  public val id: String,
  @SerialName("object")
  public val objectValue: InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7,
  public val owners: InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945,
)

/**
 * Describes a snapshot of the owners of an account at a particular point in time.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account_ownership
 */
@Serializable(with = FinancialConnectionsAccountOwnership.Serializer::class)
public class FinancialConnectionsAccountOwnership(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7,
  /**
   * A paginated list of owners for this account.
   */
  public val owners: InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7? =
        null

    public var objectValue: InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var ownersValue: InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945? = null

    public var owners: InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945
      get() = requireNotNull(ownersValue) { "owners is required" }
      set(`value`) {
        ownersValue = value
      }

    public fun build(): FinancialConnectionsAccountOwnership {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(ownersValue != null) { "owners is required" }
      return FinancialConnectionsAccountOwnership(
        created = created,
        id = id,
        objectValue = objectValue,
        owners = owners,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FinancialConnectionsAccountOwnership = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FinancialConnectionsAccountOwnership> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FinancialConnectionsAccountOwnership {
      val jsonDecoder = decoder.requireJsonDecoder("FinancialConnectionsAccountOwnership")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FinancialConnectionsAccountOwnership must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineFinancialConnectionsAccountOwnershipObjectValueX047d38c7>(rawObject, "object")
      val owners = json.decodeRequired<InlineFinancialConnectionsAccountOwnershipOwnersX8c8bb945>(rawObject, "owners")
      return FinancialConnectionsAccountOwnership(
        created = created,
        id = id,
        objectValue = objectValue,
        owners = owners,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FinancialConnectionsAccountOwnership) {
      val jsonEncoder = encoder.requireJsonEncoder("FinancialConnectionsAccountOwnership")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("owners", json.encodeToJsonElement(value.owners))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun financialConnectionsAccountOwnership(block: FinancialConnectionsAccountOwnership.Builder.() -> Unit): FinancialConnectionsAccountOwnership = FinancialConnectionsAccountOwnership.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FinancialConnectionsAccountOwnership is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
