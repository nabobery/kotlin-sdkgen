package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1auth~1keys/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1auth~1keys/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineAuthKeysPostRequestJsonX55ee707e.Serializer::class)
public class InlineAuthKeysPostRequestJsonX55ee707e(
  /**
   * The authorization code received from the OAuth redirect
   */
  public val code: String,
  /**
   * The method used to generate the code challenge
   */
  public val codeChallengeMethod: InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff? = null,
  /**
   * The code verifier if code_challenge was used in the authorization request
   */
  public val codeVerifier: String? = null,
) {
  public class Builder {
    private var codeValue: String? = null

    public var code: String
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * The method used to generate the code challenge
     */
    public var codeChallengeMethod: InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff? =
        null

    /**
     * The code verifier if code_challenge was used in the authorization request
     */
    public var codeVerifier: String? = null

    public fun build(): InlineAuthKeysPostRequestJsonX55ee707e {
      check(codeValue != null) { "code is required" }
      return InlineAuthKeysPostRequestJsonX55ee707e(
        code = code,
        codeChallengeMethod = codeChallengeMethod,
        codeVerifier = codeVerifier,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAuthKeysPostRequestJsonX55ee707e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAuthKeysPostRequestJsonX55ee707e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAuthKeysPostRequestJsonX55ee707e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAuthKeysPostRequestJsonX55ee707e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAuthKeysPostRequestJsonX55ee707e must be a JSON object")
      val code = json.decodeRequired<String>(rawObject, "code")
      return InlineAuthKeysPostRequestJsonX55ee707e(
        code = code,
        codeChallengeMethod = rawObject["code_challenge_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff?>(element) },
        codeVerifier = rawObject["code_verifier"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAuthKeysPostRequestJsonX55ee707e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAuthKeysPostRequestJsonX55ee707e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", value.code)
        value.codeChallengeMethod?.let { put("code_challenge_method", json.encodeToJsonElement(it)) }
        value.codeVerifier?.let { put("code_verifier", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAuthKeysPostRequestJsonX55ee707e(block: InlineAuthKeysPostRequestJsonX55ee707e.Builder.() -> Unit): InlineAuthKeysPostRequestJsonX55ee707e = InlineAuthKeysPostRequestJsonX55ee707e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAuthKeysPostRequestJsonX55ee707e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
