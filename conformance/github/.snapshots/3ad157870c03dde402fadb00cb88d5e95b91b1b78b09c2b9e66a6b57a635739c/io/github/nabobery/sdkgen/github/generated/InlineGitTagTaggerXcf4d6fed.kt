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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/git-tag/properties/tagger.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-tag/properties/tagger
 */
@Serializable(with = InlineGitTagTaggerXcf4d6fed.Serializer::class)
public class InlineGitTagTaggerXcf4d6fed(
  public val date: String,
  public val email: String,
  public val name: String,
) {
  public class Builder {
    private var dateValue: String? = null

    public var date: String
      get() = requireNotNull(dateValue) { "date is required" }
      set(`value`) {
        dateValue = value
      }

    private var emailValue: String? = null

    public var email: String
      get() = requireNotNull(emailValue) { "email is required" }
      set(`value`) {
        emailValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineGitTagTaggerXcf4d6fed {
      check(dateValue != null) { "date is required" }
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineGitTagTaggerXcf4d6fed(
        date = date,
        email = email,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGitTagTaggerXcf4d6fed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGitTagTaggerXcf4d6fed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGitTagTaggerXcf4d6fed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGitTagTaggerXcf4d6fed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGitTagTaggerXcf4d6fed must be a JSON object")
      val date = json.decodeRequired<String>(rawObject, "date")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineGitTagTaggerXcf4d6fed(
        date = date,
        email = email,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGitTagTaggerXcf4d6fed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGitTagTaggerXcf4d6fed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("date", value.date)
        put("email", value.email)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGitTagTaggerXcf4d6fed(block: InlineGitTagTaggerXcf4d6fed.Builder.() -> Unit): InlineGitTagTaggerXcf4d6fed = InlineGitTagTaggerXcf4d6fed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGitTagTaggerXcf4d6fed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
