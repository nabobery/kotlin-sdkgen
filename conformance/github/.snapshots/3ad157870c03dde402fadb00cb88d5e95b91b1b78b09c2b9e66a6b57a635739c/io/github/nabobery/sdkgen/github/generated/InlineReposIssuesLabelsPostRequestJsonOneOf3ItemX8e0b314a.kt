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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/post/requestBody/content
 * /application~1json/schema/oneOf/2/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/post/requestBody/content
 * /application~1json/schema/oneOf/2/items
 */
@Serializable(with = InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a.Serializer::class)
public class InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a(
  public val name: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a {
      check(nameValue != null) { "name is required" }
      return InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a(
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a(
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a(block: InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a.Builder.() -> Unit): InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a = InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesLabelsPostRequestJsonOneOf3ItemX8e0b314a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
