package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1gists/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1gists/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineGistsPostRequestJsonXf7577ba9.Serializer::class)
public class InlineGistsPostRequestJsonXf7577ba9(
  /**
   * Names and content for the files that make up the gist
   */
  public val files: Map<String, InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2>,
  /**
   * Description of the gist
   */
  public val description: String? = null,
  public val `public`: InlineGistsPostRequestJsonPublicX2d72ddb3? = null,
) {
  public class Builder {
    private var filesValue: Map<String, InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2>? =
        null

    public var files: Map<String, InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2>
      get() = requireNotNull(filesValue) { "files is required" }
      set(`value`) {
        filesValue = value
      }

    /**
     * Description of the gist
     */
    public var description: String? = null

    public var `public`: InlineGistsPostRequestJsonPublicX2d72ddb3? = null

    public fun build(): InlineGistsPostRequestJsonXf7577ba9 {
      check(filesValue != null) { "files is required" }
      return InlineGistsPostRequestJsonXf7577ba9(
        files = files,
        description = description,
        public = public,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistsPostRequestJsonXf7577ba9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGistsPostRequestJsonXf7577ba9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistsPostRequestJsonXf7577ba9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistsPostRequestJsonXf7577ba9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistsPostRequestJsonXf7577ba9 must be a JSON object")
      val files = json.decodeRequired<Map<String, InlineGistsPostRequestJsonFilesAdditionalValueX3cc2e9e2>>(rawObject, "files")
      return InlineGistsPostRequestJsonXf7577ba9(
        files = files,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        public = rawObject["public"]?.let { json.decodeFromJsonElement<InlineGistsPostRequestJsonPublicX2d72ddb3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistsPostRequestJsonXf7577ba9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistsPostRequestJsonXf7577ba9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("files", json.encodeToJsonElement(value.files))
        value.description?.let { put("description", it) }
        value.public?.let { put("public", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGistsPostRequestJsonXf7577ba9(block: InlineGistsPostRequestJsonXf7577ba9.Builder.() -> Unit): InlineGistsPostRequestJsonXf7577ba9 = InlineGistsPostRequestJsonXf7577ba9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGistsPostRequestJsonXf7577ba9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
