package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cash_balance/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cash_balance/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersCashBalancePostRequestFormX6eb72ec3.Serializer::class)
public class InlineV1CustomersCashBalancePostRequestFormX6eb72ec3(
  expand: List<String>? = null,
  /**
   * A hash of settings for this cash balance.
   */
  public val settings: InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A hash of settings for this cash balance.
     */
    public var settings: InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721? = null

    public fun build(): InlineV1CustomersCashBalancePostRequestFormX6eb72ec3 = InlineV1CustomersCashBalancePostRequestFormX6eb72ec3(
      expand = expand,
      settings = settings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersCashBalancePostRequestFormX6eb72ec3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersCashBalancePostRequestFormX6eb72ec3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCashBalancePostRequestFormX6eb72ec3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCashBalancePostRequestFormX6eb72ec3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersCashBalancePostRequestFormX6eb72ec3 must be a JSON object")
      return InlineV1CustomersCashBalancePostRequestFormX6eb72ec3(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        settings = rawObject["settings"]?.let { json.decodeFromJsonElement<InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCashBalancePostRequestFormX6eb72ec3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersCashBalancePostRequestFormX6eb72ec3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.settings?.let { put("settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersCashBalancePostRequestFormX6eb72ec3(block: InlineV1CustomersCashBalancePostRequestFormX6eb72ec3.Builder.() -> Unit): InlineV1CustomersCashBalancePostRequestFormX6eb72ec3 = InlineV1CustomersCashBalancePostRequestFormX6eb72ec3.build(block)
