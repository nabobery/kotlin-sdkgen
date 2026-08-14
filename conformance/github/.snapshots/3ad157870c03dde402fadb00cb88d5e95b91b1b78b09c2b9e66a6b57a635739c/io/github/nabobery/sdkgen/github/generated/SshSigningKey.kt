package io.github.nabobery.sdkgen.github.generated

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
 * A public SSH key used to sign Git commits
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ssh-signing-key
 */
@Serializable(with = SshSigningKey.Serializer::class)
public class SshSigningKey(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val id: Int,
  public val key: String,
  public val title: String,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    public fun build(): SshSigningKey {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(keyValue != null) { "key is required" }
      check(titleValue != null) { "title is required" }
      return SshSigningKey(
        createdAt = createdAt,
        id = id,
        key = key,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SshSigningKey = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SshSigningKey> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SshSigningKey {
      val jsonDecoder = decoder.requireJsonDecoder("SshSigningKey")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SshSigningKey must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val key = json.decodeRequired<String>(rawObject, "key")
      val title = json.decodeRequired<String>(rawObject, "title")
      return SshSigningKey(
        createdAt = createdAt,
        id = id,
        key = key,
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SshSigningKey) {
      val jsonEncoder = encoder.requireJsonEncoder("SshSigningKey")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("key", value.key)
        put("title", value.title)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sshSigningKey(block: SshSigningKey.Builder.() -> Unit): SshSigningKey = SshSigningKey.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SshSigningKey is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
