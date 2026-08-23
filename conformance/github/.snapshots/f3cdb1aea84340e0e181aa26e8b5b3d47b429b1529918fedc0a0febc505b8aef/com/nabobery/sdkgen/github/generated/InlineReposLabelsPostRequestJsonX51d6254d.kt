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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1labels/post/requestBody/content/application~1json/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1labels/post/requestBody/content/application~1json/schem
 * a
 */
@Serializable(with = InlineReposLabelsPostRequestJsonX51d6254d.Serializer::class)
public class InlineReposLabelsPostRequestJsonX51d6254d(
  /**
   * The name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For
   * example, typing `:strawberry:` will render the emoji
   * ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full
   * list of available emoji and codes, see "[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet)."
   */
  public val name: String,
  /**
   * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
   */
  public val color: String? = null,
  /**
   * A short description of the label. Must be 100 characters or fewer.
   */
  public val description: String? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
     */
    public var color: String? = null

    /**
     * A short description of the label. Must be 100 characters or fewer.
     */
    public var description: String? = null

    public fun build(): InlineReposLabelsPostRequestJsonX51d6254d {
      check(nameValue != null) { "name is required" }
      return InlineReposLabelsPostRequestJsonX51d6254d(
        name = name,
        color = color,
        description = description,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposLabelsPostRequestJsonX51d6254d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposLabelsPostRequestJsonX51d6254d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposLabelsPostRequestJsonX51d6254d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposLabelsPostRequestJsonX51d6254d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposLabelsPostRequestJsonX51d6254d must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineReposLabelsPostRequestJsonX51d6254d(
        name = name,
        color = rawObject["color"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposLabelsPostRequestJsonX51d6254d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposLabelsPostRequestJsonX51d6254d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.color?.let { put("color", it) }
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposLabelsPostRequestJsonX51d6254d(block: InlineReposLabelsPostRequestJsonX51d6254d.Builder.() -> Unit): InlineReposLabelsPostRequestJsonX51d6254d = InlineReposLabelsPostRequestJsonX51d6254d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposLabelsPostRequestJsonX51d6254d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
