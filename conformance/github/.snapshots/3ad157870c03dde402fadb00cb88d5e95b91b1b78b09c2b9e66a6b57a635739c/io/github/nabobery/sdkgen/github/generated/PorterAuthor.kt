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
 * Porter Author
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/porter-author
 */
@Serializable(with = PorterAuthor.Serializer::class)
public class PorterAuthor(
  public val email: String,
  public val id: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val importUrl: String,
  public val name: String,
  public val remoteId: String,
  public val remoteName: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var emailValue: String? = null

    public var email: String
      get() = requireNotNull(emailValue) { "email is required" }
      set(`value`) {
        emailValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var importUrlValue: String? = null

    public var importUrl: String
      get() = requireNotNull(importUrlValue) { "importUrl is required" }
      set(`value`) {
        importUrlValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var remoteIdValue: String? = null

    public var remoteId: String
      get() = requireNotNull(remoteIdValue) { "remoteId is required" }
      set(`value`) {
        remoteIdValue = value
      }

    private var remoteNameValue: String? = null

    public var remoteName: String
      get() = requireNotNull(remoteNameValue) { "remoteName is required" }
      set(`value`) {
        remoteNameValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): PorterAuthor {
      check(emailValue != null) { "email is required" }
      check(idValue != null) { "id is required" }
      check(importUrlValue != null) { "importUrl is required" }
      check(nameValue != null) { "name is required" }
      check(remoteIdValue != null) { "remoteId is required" }
      check(remoteNameValue != null) { "remoteName is required" }
      check(urlValue != null) { "url is required" }
      return PorterAuthor(
        email = email,
        id = id,
        importUrl = importUrl,
        name = name,
        remoteId = remoteId,
        remoteName = remoteName,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PorterAuthor = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PorterAuthor> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PorterAuthor {
      val jsonDecoder = decoder.requireJsonDecoder("PorterAuthor")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PorterAuthor must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val importUrl = json.decodeRequired<String>(rawObject, "import_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val remoteId = json.decodeRequired<String>(rawObject, "remote_id")
      val remoteName = json.decodeRequired<String>(rawObject, "remote_name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return PorterAuthor(
        email = email,
        id = id,
        importUrl = importUrl,
        name = name,
        remoteId = remoteId,
        remoteName = remoteName,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PorterAuthor) {
      val jsonEncoder = encoder.requireJsonEncoder("PorterAuthor")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
        put("id", json.encodeToJsonElement(value.id))
        put("import_url", value.importUrl)
        put("name", value.name)
        put("remote_id", value.remoteId)
        put("remote_name", value.remoteName)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun porterAuthor(block: PorterAuthor.Builder.() -> Unit): PorterAuthor = PorterAuthor.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PorterAuthor is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
