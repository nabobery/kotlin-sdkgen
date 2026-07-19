package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1keys/post/requestBody/content/application~1json/schema.
 */
@Serializable(with = InlinePathsKeysPostRequestBodyContentApplicationJsonSchema.Serializer::class)
public class InlinePathsKeysPostRequestBodyContentApplicationJsonSchema(
  /**
   * Name for the new API key
   */
  public val name: String,
  /**
   * Optional user ID of the key creator. Only meaningful for organization-owned keys where a specific member is
   * creating the key.
   */
  public val creatorUserId: String? = null,
  /**
   * Optional ISO 8601 UTC timestamp when the API key should expire. Must be UTC, other timezones will be rejected
   */
  public val expiresAt: String? = null,
  /**
   * Whether to include BYOK usage in the limit
   */
  public val includeByokInLimit: Boolean? = null,
  /**
   * Optional spending limit for the API key in USD
   */
  public val limit: Double? = null,
  /**
   * Type of limit reset for the API key (daily, weekly, monthly, or null for no reset). Resets happen automatically at
   * midnight UTC, and weeks are Monday through Sunday.
   */
  public val limitReset:
      InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset? = null,
  /**
   * The workspace to create the API key in. Defaults to the default workspace if not provided.
   */
  public val workspaceId: String? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Optional user ID of the key creator. Only meaningful for organization-owned keys where a specific member is
     * creating the key.
     */
    public var creatorUserId: String? = null

    /**
     * Optional ISO 8601 UTC timestamp when the API key should expire. Must be UTC, other timezones will be rejected
     */
    public var expiresAt: String? = null

    /**
     * Whether to include BYOK usage in the limit
     */
    public var includeByokInLimit: Boolean? = null

    /**
     * Optional spending limit for the API key in USD
     */
    public var limit: Double? = null

    /**
     * Type of limit reset for the API key (daily, weekly, monthly, or null for no reset). Resets happen automatically
     * at midnight UTC, and weeks are Monday through Sunday.
     */
    public var limitReset:
        InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset? = null

    /**
     * The workspace to create the API key in. Defaults to the default workspace if not provided.
     */
    public var workspaceId: String? = null

    public fun build(): InlinePathsKeysPostRequestBodyContentApplicationJsonSchema {
      check(nameValue != null) { "name is required" }
      return InlinePathsKeysPostRequestBodyContentApplicationJsonSchema(
        name = name,
        creatorUserId = creatorUserId,
        expiresAt = expiresAt,
        includeByokInLimit = includeByokInLimit,
        limit = limit,
        limitReset = limitReset,
        workspaceId = workspaceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsKeysPostRequestBodyContentApplicationJsonSchema = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsKeysPostRequestBodyContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsKeysPostRequestBodyContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsKeysPostRequestBodyContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsKeysPostRequestBodyContentApplicationJsonSchema must be a JSON object")
      val name = json.decodeRequired<String>(raw, "name")
      return InlinePathsKeysPostRequestBodyContentApplicationJsonSchema(
        name = name,
        creatorUserId = raw["creator_user_id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        expiresAt = raw["expires_at"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        includeByokInLimit = raw["include_byok_in_limit"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        limit = raw["limit"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        limitReset = raw["limit_reset"]?.let { element -> if (element == JsonNull) null else json























































                                                                                                                        .decodeFromJsonElement<InlinePathsKeysPostRequestBodyContentApplicationJsonSchemaPropertiesLimitReset?>(element) },
        workspaceId = raw["workspace_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsKeysPostRequestBodyContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsKeysPostRequestBodyContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.creatorUserId?.let { put("creator_user_id", it) }
        value.expiresAt?.let { put("expires_at", it) }
        value.includeByokInLimit?.let { put("include_byok_in_limit", json.encodeToJsonElement(it)) }
        value.limit?.let { put("limit", json.encodeToJsonElement(it)) }
        value.limitReset?.let { put("limit_reset", json.encodeToJsonElement(it)) }
        value.workspaceId?.let { put("workspace_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsKeysPostRequestBodyContentApplicationJsonSchema(block: InlinePathsKeysPostRequestBodyContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsKeysPostRequestBodyContentApplicationJsonSchema = InlinePathsKeysPostRequestBodyContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsKeysPostRequestBodyContentApplicationJsonSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
