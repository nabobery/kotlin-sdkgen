package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1linked_accounts~1{account}~1refresh/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1linked_accounts~1{account}~1refresh/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema
 */
@Serializable(with = InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c.Serializer::class)
public class InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c(
  features: List<InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb>,
  expand: List<String>? = null,
) {
  /**
   * The list of account features that you would like to refresh.
   */
  public val features: List<InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb> =
      features.toList()

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var featuresValue:
        List<InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb>? = null

    public var features: List<InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb>
      get() = requireNotNull(featuresValue) { "features is required" }.toList()
      set(`value`) {
        featuresValue = value.toList()
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c {
      check(featuresValue != null) { "features is required" }
      return InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c(
        features = features,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c must be a JSON object")
      val features = json.decodeRequired<List<InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb>>(rawObject, "features")
      return InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c(
        features = features,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("features", json.encodeToJsonElement(value.features))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c(block: InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c.Builder.() -> Unit): InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c = InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1LinkedAccountsRefreshPostRequestFormX0cf80d7c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
