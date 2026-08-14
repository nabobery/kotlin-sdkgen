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
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-minimal/properties/head/properties/repo.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-minimal/properties/head/properties/repo
 */
@Serializable(with = InlinePullRequestMinimalHeadRepoXe5795fd0.Serializer::class)
public class InlinePullRequestMinimalHeadRepoXe5795fd0(
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

    public fun build(): InlinePullRequestMinimalHeadRepoXe5795fd0 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      return InlinePullRequestMinimalHeadRepoXe5795fd0(
        id = id,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestMinimalHeadRepoXe5795fd0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestMinimalHeadRepoXe5795fd0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestMinimalHeadRepoXe5795fd0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestMinimalHeadRepoXe5795fd0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestMinimalHeadRepoXe5795fd0 must be a JSON object")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlinePullRequestMinimalHeadRepoXe5795fd0(
        id = id,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestMinimalHeadRepoXe5795fd0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestMinimalHeadRepoXe5795fd0")
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

public fun inlinePullRequestMinimalHeadRepoXe5795fd0(block: InlinePullRequestMinimalHeadRepoXe5795fd0.Builder.() -> Unit): InlinePullRequestMinimalHeadRepoXe5795fd0 = InlinePullRequestMinimalHeadRepoXe5795fd0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestMinimalHeadRepoXe5795fd0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
