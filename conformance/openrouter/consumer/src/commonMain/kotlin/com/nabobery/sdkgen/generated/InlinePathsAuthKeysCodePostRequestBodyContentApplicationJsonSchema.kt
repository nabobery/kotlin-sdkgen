package com.nabobery.sdkgen.generated

import kotlin.Double
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
 * sdkgen://source/openapi.yaml#/paths/~1auth~1keys~1code/post/requestBody/content/application~1json/schema.
 */
@Serializable(with = InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema.Serializer::class)
public class InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema(
  /**
   * The callback URL to redirect to after authorization. Supports https URLs and localhost/127.0.0.1 URLs on any port
   * for local CLI tools.
   */
  public val callbackUrl: String,
  /**
   * PKCE code challenge for enhanced security
   */
  public val codeChallenge: String? = null,
  /**
   * The method used to generate the code challenge
   */
  public val codeChallengeMethod:
      InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5? = null,
  /**
   * Optional expiration time for the API key to be created
   */
  public val expiresAt: String? = null,
  /**
   * Optional custom label for the API key. Defaults to the app name if not provided.
   */
  public val keyLabel: String? = null,
  /**
   * Credit limit for the API key to be created
   */
  public val limit: Double? = null,
  /**
   * Agent identifier for spawn telemetry
   */
  public val spawnAgent: String? = null,
  /**
   * Cloud identifier for spawn telemetry
   */
  public val spawnCloud: String? = null,
  /**
   * Optional credit limit reset interval. When set, the credit limit resets on this interval.
   */
  public val usageLimitType:
      InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType? = null,
  /**
   * Optional workspace ID to associate the API key with
   */
  public val workspaceId: String? = null,
) {
  public class Builder {
    private var callbackUrlValue: String? = null

    public var callbackUrl: String
      get() = requireNotNull(callbackUrlValue) { "callbackUrl is required" }
      set(`value`) {
        callbackUrlValue = value
      }

    /**
     * PKCE code challenge for enhanced security
     */
    public var codeChallenge: String? = null

    /**
     * The method used to generate the code challenge
     */
    public var codeChallengeMethod:
        InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5? =
        null

    /**
     * Optional expiration time for the API key to be created
     */
    public var expiresAt: String? = null

    /**
     * Optional custom label for the API key. Defaults to the app name if not provided.
     */
    public var keyLabel: String? = null

    /**
     * Credit limit for the API key to be created
     */
    public var limit: Double? = null

    /**
     * Agent identifier for spawn telemetry
     */
    public var spawnAgent: String? = null

    /**
     * Cloud identifier for spawn telemetry
     */
    public var spawnCloud: String? = null

    /**
     * Optional credit limit reset interval. When set, the credit limit resets on this interval.
     */
    public var usageLimitType:
        InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType?
        = null

    /**
     * Optional workspace ID to associate the API key with
     */
    public var workspaceId: String? = null

    public fun build(): InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema {
      check(callbackUrlValue != null) { "callbackUrl is required" }
      return InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema(
        callbackUrl = callbackUrl,
        codeChallenge = codeChallenge,
        codeChallengeMethod = codeChallengeMethod,
        expiresAt = expiresAt,
        keyLabel = keyLabel,
        limit = limit,
        spawnAgent = spawnAgent,
        spawnCloud = spawnCloud,
        usageLimitType = usageLimitType,
        workspaceId = workspaceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema must be a " +
          "JSON object")
      val callbackUrl = json.decodeRequired<String>(raw, "callback_url")
      return InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema(
        callbackUrl = callbackUrl,
        codeChallenge = raw["code_challenge"]?.let { json.decodeFromJsonElement<String>(it) },
        codeChallengeMethod = raw["code_challenge_method"]?.let { json
          .decodeFromJsonElement<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesCode676847a5>(it) },
        expiresAt = raw["expires_at"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        keyLabel = raw["key_label"]?.let { json.decodeFromJsonElement<String>(it) },
        limit = raw["limit"]?.let { json.decodeFromJsonElement<Double>(it) },
        spawnAgent = raw["spawn_agent"]?.let { json.decodeFromJsonElement<String>(it) },
        spawnCloud = raw["spawn_cloud"]?.let { json.decodeFromJsonElement<String>(it) },
        usageLimitType = raw["usage_limit_type"]?.let { json
          .decodeFromJsonElement<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchemaPropertiesUsageLimitType>(it) },
        workspaceId = raw["workspace_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("callback_url", value.callbackUrl)
        value.codeChallenge?.let { put("code_challenge", it) }
        value.codeChallengeMethod?.let { put("code_challenge_method", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", it) }
        value.keyLabel?.let { put("key_label", it) }
        value.limit?.let { put("limit", json.encodeToJsonElement(it)) }
        value.spawnAgent?.let { put("spawn_agent", it) }
        value.spawnCloud?.let { put("spawn_cloud", it) }
        value.usageLimitType?.let { put("usage_limit_type", json.encodeToJsonElement(it)) }
        value.workspaceId?.let { put("workspace_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema(block: InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema = InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
