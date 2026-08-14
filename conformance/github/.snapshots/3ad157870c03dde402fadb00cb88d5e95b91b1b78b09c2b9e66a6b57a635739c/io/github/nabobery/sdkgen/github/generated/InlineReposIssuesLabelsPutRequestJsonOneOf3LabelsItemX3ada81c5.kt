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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/put/requestBody/content/
 * application~1json/schema/oneOf/2/properties/labels/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/put/requestBody/content/
 * application~1json/schema/oneOf/2/properties/labels/items
 */
@Serializable(with = InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5.Serializer::class)
public class InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5(
  public val name: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5 {
      check(nameValue != null) { "name is required" }
      return InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5(
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5(
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5(block: InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5.Builder.() -> Unit): InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5 = InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
