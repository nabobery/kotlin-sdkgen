package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1devcontainers/get/responses/200/content/app
 * lication~1json/schema/properties/devcontainers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1devcontainers/get/responses/200/content/app
 * lication~1json/schema/properties/devcontainers/items
 */
@Serializable(with = InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8.Serializer::class)
public class InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8(
  public val path: String,
  public val displayName: String? = null,
  public val name: String? = null,
) {
  public class Builder {
    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    public var displayName: String? = null

    public var name: String? = null

    public fun build(): InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8 {
      check(pathValue != null) { "path is required" }
      return InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8(
        path = path,
        displayName = displayName,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8 must be a JSON object")
      val path = json.decodeRequired<String>(rawObject, "path")
      return InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8(
        path = path,
        displayName = rawObject["display_name"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("path", value.path)
        value.displayName?.let { put("display_name", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8(block: InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8.Builder.() -> Unit): InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8 = InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCodespacesDevcontainersGetResponse200JsonDevcontainersItemX09de1fb8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
