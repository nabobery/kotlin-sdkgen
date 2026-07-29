package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1gists/post/requestBody/content/application~1json/schema/properties/files/additi
 * onalProperties.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1gists/post/requestBody/content/application~1json/schema/properties/files/additi
 * onalProperties
 */
@Serializable(with = InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2.Serializer::class)
public class InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2(
  /**
   * Content of the file
   */
  public val content: String,
) {
  public class Builder {
    private var contentValue: String? = null

    public var content: String
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    public fun build(): InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2 {
      check(contentValue != null) { "content is required" }
      return InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2(
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2 must be a JSON object")
      val content = json.decodeRequired<String>(rawObject, "content")
      return InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2(
        content = content,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2(block: InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2.Builder.() -> Unit): InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2 = InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
