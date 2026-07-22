package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * object containing information about the author.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1contents~1{path}/delete/requestBody/content/application
 * ~1json/schema/properties/author
 */
@Serializable(with = InlineReposContentsDeleteRequestJsonAuthorX39b94541.Serializer::class)
public class InlineReposContentsDeleteRequestJsonAuthorX39b94541(
  /**
   * The email of the author (or committer) of the commit
   */
  public val email: String? = null,
  /**
   * The name of the author (or committer) of the commit
   */
  public val name: String? = null,
) {
  public class Builder {
    /**
     * The email of the author (or committer) of the commit
     */
    public var email: String? = null

    /**
     * The name of the author (or committer) of the commit
     */
    public var name: String? = null

    public fun build(): InlineReposContentsDeleteRequestJsonAuthorX39b94541 = InlineReposContentsDeleteRequestJsonAuthorX39b94541(
      email = email,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposContentsDeleteRequestJsonAuthorX39b94541 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposContentsDeleteRequestJsonAuthorX39b94541> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposContentsDeleteRequestJsonAuthorX39b94541 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposContentsDeleteRequestJsonAuthorX39b94541")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposContentsDeleteRequestJsonAuthorX39b94541 must be a JSON object")
      return InlineReposContentsDeleteRequestJsonAuthorX39b94541(
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposContentsDeleteRequestJsonAuthorX39b94541) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposContentsDeleteRequestJsonAuthorX39b94541")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposContentsDeleteRequestJsonAuthorX39b94541(block: InlineReposContentsDeleteRequestJsonAuthorX39b94541.Builder.() -> Unit): InlineReposContentsDeleteRequestJsonAuthorX39b94541 = InlineReposContentsDeleteRequestJsonAuthorX39b94541.build(block)
