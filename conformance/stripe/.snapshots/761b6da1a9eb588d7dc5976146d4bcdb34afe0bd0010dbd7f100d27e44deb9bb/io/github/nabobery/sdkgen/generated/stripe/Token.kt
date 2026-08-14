package io.github.nabobery.sdkgen.generated.stripe

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
 * Tokenization is the process Stripe uses to collect sensitive card or bank
 * account details, or personally identifiable information (PII), directly from
 * your customers in a secure manner. A token representing this information is
 * returned to your server to use. Use our
 * [recommended payments integrations](https://docs.stripe.com/payments) to perform this process
 * on the client-side. This guarantees that no sensitive card data touches your server,
 * and allows your integration to operate in a PCI-compliant way.
 *
 * If you can't use client-side tokenization, you can also create tokens using
 * the API with either your publishable or secret API key. If
 * your integration uses this method, you're responsible for any PCI compliance
 * that it might require, and you must keep your secret API key safe. Unlike with
 * client-side tokenization, your customer's information isn't sent directly to
 * Stripe, so we can't determine how it's handled or stored.
 *
 * You can't store or use tokens more than once. To store card or bank account
 * information for later use, create [Customer](https://docs.stripe.com/api#customers)
 * objects or [External accounts](/api#external_accounts).
 * [Radar](https://docs.stripe.com/radar), our integrated solution for automatic fraud protection,
 * performs best with integrations that use client-side tokenization.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/token
 */
@Serializable(with = Token.Serializer::class)
public class Token(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTokenObjectValueX08395b4c,
  /**
   * Type of the token: `account`, `bank_account`, `card`, or `pii`.
   */
  public val type: String,
  /**
   * Determines if you have already used this token (you can only use tokens once).
   */
  public val used: Boolean,
  public val bankAccount: BankAccount? = null,
  public val card: Card? = null,
  /**
   * IP address of the client that generates the token.
   */
  public val clientIp: String? = null,
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

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTokenObjectValueX08395b4c? = null

    public var objectValue: InlineTokenObjectValueX08395b4c
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var usedValue: Boolean? = null

    public var used: Boolean
      get() = requireNotNull(usedValue) { "used is required" }
      set(`value`) {
        usedValue = value
      }

    public var bankAccount: BankAccount? = null

    public var card: Card? = null

    /**
     * IP address of the client that generates the token.
     */
    public var clientIp: String? = null

    public fun build(): Token {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(typeValue != null) { "type is required" }
      check(usedValue != null) { "used is required" }
      return Token(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        type = type,
        used = used,
        bankAccount = bankAccount,
        card = card,
        clientIp = clientIp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Token = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Token> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Token {
      val jsonDecoder = decoder.requireJsonDecoder("Token")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Token must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTokenObjectValueX08395b4c>(rawObject, "object")
      val type = json.decodeRequired<String>(rawObject, "type")
      val used = json.decodeRequired<Boolean>(rawObject, "used")
      return Token(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        type = type,
        used = used,
        bankAccount = rawObject["bank_account"]?.let { json.decodeFromJsonElement<BankAccount>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<Card>(it) },
        clientIp = rawObject["client_ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Token) {
      val jsonEncoder = encoder.requireJsonEncoder("Token")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("type", value.type)
        put("used", json.encodeToJsonElement(value.used))
        value.bankAccount?.let { put("bank_account", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.clientIp?.let { put("client_ip", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun token(block: Token.Builder.() -> Unit): Token = Token.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Token is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
