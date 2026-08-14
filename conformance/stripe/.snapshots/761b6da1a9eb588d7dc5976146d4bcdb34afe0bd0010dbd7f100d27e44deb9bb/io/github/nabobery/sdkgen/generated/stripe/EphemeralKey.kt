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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/ephemeral_key
 */
@Serializable(with = EphemeralKey.Serializer::class)
public class EphemeralKey(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Time at which the key will expire. Measured in seconds since the Unix epoch.
   */
  public val expires: Int,
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
  public val objectValue: InlineEphemeralKeyObjectValueXacbdbeaf,
  /**
   * The key's secret. You can use this value to make authorized requests to the Stripe API.
   */
  public val secret: String? = null,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var expiresValue: Int? = null

    public var expires: Int
      get() = requireNotNull(expiresValue) { "expires is required" }
      set(`value`) {
        expiresValue = value
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

    private var objectValueValue: InlineEphemeralKeyObjectValueXacbdbeaf? = null

    public var objectValue: InlineEphemeralKeyObjectValueXacbdbeaf
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * The key's secret. You can use this value to make authorized requests to the Stripe API.
     */
    public var secret: String? = null

    public fun build(): EphemeralKey {
      check(createdValue != null) { "created is required" }
      check(expiresValue != null) { "expires is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return EphemeralKey(
        created = created,
        expires = expires,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        secret = secret,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EphemeralKey = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EphemeralKey> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EphemeralKey {
      val jsonDecoder = decoder.requireJsonDecoder("EphemeralKey")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EphemeralKey must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val expires = json.decodeRequired<Int>(rawObject, "expires")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineEphemeralKeyObjectValueXacbdbeaf>(rawObject, "object")
      return EphemeralKey(
        created = created,
        expires = expires,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        secret = rawObject["secret"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: EphemeralKey) {
      val jsonEncoder = encoder.requireJsonEncoder("EphemeralKey")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("expires", json.encodeToJsonElement(value.expires))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        value.secret?.let { put("secret", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun ephemeralKey(block: EphemeralKey.Builder.() -> Unit): EphemeralKey = EphemeralKey.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EphemeralKey is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
