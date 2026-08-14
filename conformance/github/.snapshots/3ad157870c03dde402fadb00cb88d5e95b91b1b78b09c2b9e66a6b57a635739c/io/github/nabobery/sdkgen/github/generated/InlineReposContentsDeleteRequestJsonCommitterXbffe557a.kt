package io.github.nabobery.sdkgen.github.generated

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
 * object containing information about the committer.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1contents~1{path}/delete/requestBody/content/application
 * ~1json/schema/properties/committer
 */
@Serializable(with = InlineReposContentsDeleteRequestJsonCommitterXbffe557a.Serializer::class)
public class InlineReposContentsDeleteRequestJsonCommitterXbffe557a(
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

    public fun build(): InlineReposContentsDeleteRequestJsonCommitterXbffe557a = InlineReposContentsDeleteRequestJsonCommitterXbffe557a(
      email = email,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposContentsDeleteRequestJsonCommitterXbffe557a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposContentsDeleteRequestJsonCommitterXbffe557a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposContentsDeleteRequestJsonCommitterXbffe557a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposContentsDeleteRequestJsonCommitterXbffe557a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposContentsDeleteRequestJsonCommitterXbffe557a must be a JSON object")
      return InlineReposContentsDeleteRequestJsonCommitterXbffe557a(
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposContentsDeleteRequestJsonCommitterXbffe557a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposContentsDeleteRequestJsonCommitterXbffe557a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposContentsDeleteRequestJsonCommitterXbffe557a(block: InlineReposContentsDeleteRequestJsonCommitterXbffe557a.Builder.() -> Unit): InlineReposContentsDeleteRequestJsonCommitterXbffe557a = InlineReposContentsDeleteRequestJsonCommitterXbffe557a.build(block)
