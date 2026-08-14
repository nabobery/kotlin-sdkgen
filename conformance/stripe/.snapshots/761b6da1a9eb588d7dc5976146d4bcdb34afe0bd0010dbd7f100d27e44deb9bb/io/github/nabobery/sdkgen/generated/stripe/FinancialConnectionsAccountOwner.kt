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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Describes an owner of an account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account_owner
 */
@Serializable(with = FinancialConnectionsAccountOwner.Serializer::class)
public class FinancialConnectionsAccountOwner(
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The full name of the owner.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b,
  /**
   * The ownership object that this owner belongs to.
   */
  public val ownership: String,
  /**
   * The email address of the owner.
   */
  public val email: String? = null,
  /**
   * The raw phone number of the owner.
   */
  public val phone: String? = null,
  /**
   * The raw physical address of the owner.
   */
  public val rawAddress: String? = null,
  /**
   * The timestamp of the refresh that updated this owner.
   */
  public val refreshedAt: Int? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b? = null

    public var objectValue: InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var ownershipValue: String? = null

    public var ownership: String
      get() = requireNotNull(ownershipValue) { "ownership is required" }
      set(`value`) {
        ownershipValue = value
      }

    /**
     * The email address of the owner.
     */
    public var email: String? = null

    /**
     * The raw phone number of the owner.
     */
    public var phone: String? = null

    /**
     * The raw physical address of the owner.
     */
    public var rawAddress: String? = null

    /**
     * The timestamp of the refresh that updated this owner.
     */
    public var refreshedAt: Int? = null

    public fun build(): FinancialConnectionsAccountOwner {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(ownershipValue != null) { "ownership is required" }
      return FinancialConnectionsAccountOwner(
        id = id,
        name = name,
        objectValue = objectValue,
        ownership = ownership,
        email = email,
        phone = phone,
        rawAddress = rawAddress,
        refreshedAt = refreshedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FinancialConnectionsAccountOwner = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FinancialConnectionsAccountOwner> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FinancialConnectionsAccountOwner {
      val jsonDecoder = decoder.requireJsonDecoder("FinancialConnectionsAccountOwner")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FinancialConnectionsAccountOwner must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineFinancialConnectionsAccountOwnerObjectValueX05d0828b>(rawObject, "object")
      val ownership = json.decodeRequired<String>(rawObject, "ownership")
      return FinancialConnectionsAccountOwner(
        id = id,
        name = name,
        objectValue = objectValue,
        ownership = ownership,
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        rawAddress = rawObject["raw_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refreshedAt = rawObject["refreshed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FinancialConnectionsAccountOwner) {
      val jsonEncoder = encoder.requireJsonEncoder("FinancialConnectionsAccountOwner")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("ownership", value.ownership)
        value.email?.let { put("email", it) }
        value.phone?.let { put("phone", it) }
        value.rawAddress?.let { put("raw_address", it) }
        value.refreshedAt?.let { put("refreshed_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun financialConnectionsAccountOwner(block: FinancialConnectionsAccountOwner.Builder.() -> Unit): FinancialConnectionsAccountOwner = FinancialConnectionsAccountOwner.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FinancialConnectionsAccountOwner is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
