package io.github.nabobery.sdkgen.generated.stripe

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
 * A Connection Token is used by the Stripe Terminal SDK to connect to a reader.
 *
 * Related guide: [Fleet management](https://docs.stripe.com/terminal/fleet/locations)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.connection_token
 */
@Serializable(with = TerminalConnectionToken.Serializer::class)
public class TerminalConnectionToken(
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTerminalConnectionTokenObjectValueX834395da,
  /**
   * Your application should pass this token to the Stripe Terminal SDK.
   */
  public val secret: String,
  /**
   * The id of the location that this connection token is scoped to. Note that location scoping only applies to
   * internet-connected readers. For more details, see [the docs on scoping connection
   * tokens](https://docs.stripe.com/terminal/fleet/locations-and-zones?dashboard-or-api=api#connection-tokens).
   */
  public val location: String? = null,
) {
  public class Builder {
    private var objectValueValue: InlineTerminalConnectionTokenObjectValueX834395da? = null

    public var objectValue: InlineTerminalConnectionTokenObjectValueX834395da
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var secretValue: String? = null

    public var secret: String
      get() = requireNotNull(secretValue) { "secret is required" }
      set(`value`) {
        secretValue = value
      }

    /**
     * The id of the location that this connection token is scoped to. Note that location scoping only applies to
     * internet-connected readers. For more details, see [the docs on scoping connection
     * tokens](https://docs.stripe.com/terminal/fleet/locations-and-zones?dashboard-or-api=api#connection-tokens).
     */
    public var location: String? = null

    public fun build(): TerminalConnectionToken {
      check(objectValueValue != null) { "objectValue is required" }
      check(secretValue != null) { "secret is required" }
      return TerminalConnectionToken(
        objectValue = objectValue,
        secret = secret,
        location = location,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConnectionToken = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalConnectionToken> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConnectionToken {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConnectionToken")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConnectionToken must be a JSON object")
      val objectValue = json.decodeRequired<InlineTerminalConnectionTokenObjectValueX834395da>(rawObject, "object")
      val secret = json.decodeRequired<String>(rawObject, "secret")
      return TerminalConnectionToken(
        objectValue = objectValue,
        secret = secret,
        location = rawObject["location"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConnectionToken) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConnectionToken")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("object", json.encodeToJsonElement(value.objectValue))
        put("secret", value.secret)
        value.location?.let { put("location", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConnectionToken(block: TerminalConnectionToken.Builder.() -> Unit): TerminalConnectionToken = TerminalConnectionToken.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalConnectionToken is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
