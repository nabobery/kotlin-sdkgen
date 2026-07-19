package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema.Serializer::class)
public class InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema(
  /**
   * The authorization code received from the OAuth redirect
   */
  public val code: String,
  /**
   * The method used to generate the code challenge
   */
  public val codeChallengeMethod:
      InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchemaPropertiesCodeChalc0f3e8ff? = null,
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
    public var codeChallengeMethod:
        InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchemaPropertiesCodeChalc0f3e8ff? =
        null

    /**
     * The code verifier if code_challenge was used in the authorization request
     */
    public var codeVerifier: String? = null

    public fun build(): InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema {
      check(codeValue != null) { "code is required" }
      return InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema(
        code = code,
        codeChallengeMethod = codeChallengeMethod,
        codeVerifier = codeVerifier,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema must be a JSON " +
          "object")
      val code = json.decodeRequired<String>(raw, "code")
      return InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema(
        code = code,
        codeChallengeMethod = raw["code_challenge_method"]?.let { element -> if (element == JsonNull) null else json























































                                                                                                                        .decodeFromJsonElement<InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchemaPropertiesCodeChalc0f3e8ff?>(element) },
        codeVerifier = raw["code_verifier"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema")
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

public fun inlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema(block: InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema = InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
