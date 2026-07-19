package com.nabobery.sdkgen.generated

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Auth code data
 */
@Serializable(with = InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData
  .Serializer::class)
public class InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData(
  /**
   * The application ID associated with this auth code
   */
  public val appId: Int,
  /**
   * ISO 8601 timestamp of when the auth code was created
   */
  public val createdAt: String,
  /**
   * The authorization code ID to use in the exchange request
   */
  public val id: String,
) {
  public class Builder {
    private var appIdValue: Int? = null

    public var appId: Int
      get() = requireNotNull(appIdValue) { "appId is required" }
      set(`value`) {
        appIdValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData {
      check(appIdValue != null) { "appId is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      return InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData(
        appId = appId,
        createdAt = createdAt,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData " +
          "must be a JSON object")
      val appId = json.decodeRequired<Int>(raw, "app_id")
      val createdAt = json.decodeRequired<String>(raw, "created_at")
      val id = json.decodeRequired<String>(raw, "id")
      return InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData(
        appId = appId,
        createdAt = createdAt,
        id = id,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app_id", json.encodeToJsonElement(value.appId))
        put("created_at", value.createdAt)
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData(block: InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData.Builder.() -> Unit): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData = InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchemaPropertiesData " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
