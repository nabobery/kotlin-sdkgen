package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
public data class DeletedBankAccountView(
  public val currency: String? = null,
  public val deleted: Boolean,
  public val id: String,
  @SerialName("object")
  public val objectValue: InlineDeletedBankAccountObjectValueX5ece9c66,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_bank_account
 */
@Serializable(with = DeletedBankAccount.Serializer::class)
public class DeletedBankAccount(
  /**
   * Always true for a deleted object
   */
  public val deleted: Boolean,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineDeletedBankAccountObjectValueX5ece9c66,
  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/payouts) paid out to the bank account.
   */
  public val currency: String? = null,
) {
  public class Builder {
    private var deletedValue: Boolean? = null

    public var deleted: Boolean
      get() = requireNotNull(deletedValue) { "deleted is required" }
      set(`value`) {
        deletedValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineDeletedBankAccountObjectValueX5ece9c66? = null

    public var objectValue: InlineDeletedBankAccountObjectValueX5ece9c66
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/payouts) paid out to the bank account.
     */
    public var currency: String? = null

    public fun build(): DeletedBankAccount {
      check(deletedValue != null) { "deleted is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return DeletedBankAccount(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
        currency = currency,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeletedBankAccount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DeletedBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeletedBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("DeletedBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeletedBankAccount must be a JSON object")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineDeletedBankAccountObjectValueX5ece9c66>(rawObject, "object")
      return DeletedBankAccount(
        deleted = deleted,
        id = id,
        objectValue = objectValue,
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeletedBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("DeletedBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deleted", json.encodeToJsonElement(value.deleted))
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.currency?.let { put("currency", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deletedBankAccount(block: DeletedBankAccount.Builder.() -> Unit): DeletedBankAccount = DeletedBankAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeletedBankAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
