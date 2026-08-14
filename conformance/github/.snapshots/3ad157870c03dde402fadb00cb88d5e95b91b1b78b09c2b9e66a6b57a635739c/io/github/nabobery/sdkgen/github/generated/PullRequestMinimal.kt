package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-minimal.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-minimal
 */
@Serializable(with = PullRequestMinimal.Serializer::class)
public class PullRequestMinimal(
  public val base: InlinePullRequestMinimalBaseXcf4a2d39,
  public val head: InlinePullRequestMinimalHeadXb9b782f0,
  public val id: Long,
  public val number: Int,
  public val url: String,
) {
  public class Builder {
    private var baseValue: InlinePullRequestMinimalBaseXcf4a2d39? = null

    public var base: InlinePullRequestMinimalBaseXcf4a2d39
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var headValue: InlinePullRequestMinimalHeadXb9b782f0? = null

    public var head: InlinePullRequestMinimalHeadXb9b782f0
      get() = requireNotNull(headValue) { "head is required" }
      set(`value`) {
        headValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): PullRequestMinimal {
      check(baseValue != null) { "base is required" }
      check(headValue != null) { "head is required" }
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      check(urlValue != null) { "url is required" }
      return PullRequestMinimal(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PullRequestMinimal = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PullRequestMinimal> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PullRequestMinimal {
      val jsonDecoder = decoder.requireJsonDecoder("PullRequestMinimal")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PullRequestMinimal must be a JSON object")
      val base = json.decodeRequired<InlinePullRequestMinimalBaseXcf4a2d39>(rawObject, "base")
      val head = json.decodeRequired<InlinePullRequestMinimalHeadXb9b782f0>(rawObject, "head")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val url = json.decodeRequired<String>(rawObject, "url")
      return PullRequestMinimal(
        base = base,
        head = head,
        id = id,
        number = number,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PullRequestMinimal) {
      val jsonEncoder = encoder.requireJsonEncoder("PullRequestMinimal")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base", json.encodeToJsonElement(value.base))
        put("head", json.encodeToJsonElement(value.head))
        put("id", json.encodeToJsonElement(value.id))
        put("number", json.encodeToJsonElement(value.number))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pullRequestMinimal(block: PullRequestMinimal.Builder.() -> Unit): PullRequestMinimal = PullRequestMinimal.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PullRequestMinimal is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
