package io.github.nabobery.sdkgen.github.generated

import kotlin.Long
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-minimal/properties/base/properties/repo.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-minimal/properties/base/properties/repo
 */
@Serializable(with = InlinePullRequestMinimalBaseRepoXfdfe2c68.Serializer::class)
public class InlinePullRequestMinimalBaseRepoXfdfe2c68(
  public val id: Long,
  public val name: String,
  public val url: String,
) {
  public class Builder {
    private var idValue: Long? = null

    public var id: Long
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

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlinePullRequestMinimalBaseRepoXfdfe2c68 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      return InlinePullRequestMinimalBaseRepoXfdfe2c68(
        id = id,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestMinimalBaseRepoXfdfe2c68 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestMinimalBaseRepoXfdfe2c68> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestMinimalBaseRepoXfdfe2c68 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestMinimalBaseRepoXfdfe2c68")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestMinimalBaseRepoXfdfe2c68 must be a JSON object")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlinePullRequestMinimalBaseRepoXfdfe2c68(
        id = id,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestMinimalBaseRepoXfdfe2c68) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestMinimalBaseRepoXfdfe2c68")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestMinimalBaseRepoXfdfe2c68(block: InlinePullRequestMinimalBaseRepoXfdfe2c68.Builder.() -> Unit): InlinePullRequestMinimalBaseRepoXfdfe2c68 = InlinePullRequestMinimalBaseRepoXfdfe2c68.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestMinimalBaseRepoXfdfe2c68 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
