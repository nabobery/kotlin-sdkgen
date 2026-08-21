package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/post/requestBody/content/application~1json/schem
 * a/properties/labels/items/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/post/requestBody/content/application~1json/schem
 * a/properties/labels/items/oneOf/1
 */
@Serializable(with = InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393.Serializer::class)
public class InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393(
  public val color: String? = null,
  public val description: String? = null,
  public val id: Int? = null,
  public val name: String? = null,
) {
  public class Builder {
    public var color: String? = null

    public var description: String? = null

    public var id: Int? = null

    public var name: String? = null

    public fun build(): InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393 = InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393(
      color = color,
      description = description,
      id = id,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393 must be a JSON object")
      return InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393(
        color = rawObject["color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.color?.let { put("color", it) }
        value.description?.let { put("description", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393(block: InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393.Builder.() -> Unit): InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393 = InlineReposIssuesPostRequestJsonLabelsItemOneOf2X061f7393.build(block)
