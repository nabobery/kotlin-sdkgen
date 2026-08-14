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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1settings/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1settings/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema
 */
@Serializable(with = InlineV1TaxSettingsPostRequestFormX6a746f8e.Serializer::class)
public class InlineV1TaxSettingsPostRequestFormX6a746f8e(
  /**
   * Default configuration to be used on Stripe Tax calculations.
   */
  public val defaults: InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3? = null,
  expand: List<String>? = null,
  /**
   * The place where your business is located.
   */
  public val headOffice: InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Default configuration to be used on Stripe Tax calculations.
     */
    public var defaults: InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3? = null

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
     * The place where your business is located.
     */
    public var headOffice: InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39? = null

    public fun build(): InlineV1TaxSettingsPostRequestFormX6a746f8e = InlineV1TaxSettingsPostRequestFormX6a746f8e(
      defaults = defaults,
      expand = expand,
      headOffice = headOffice,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxSettingsPostRequestFormX6a746f8e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxSettingsPostRequestFormX6a746f8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxSettingsPostRequestFormX6a746f8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxSettingsPostRequestFormX6a746f8e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxSettingsPostRequestFormX6a746f8e must be a JSON object")
      return InlineV1TaxSettingsPostRequestFormX6a746f8e(
        defaults = rawObject["defaults"]?.let { json.decodeFromJsonElement<InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        headOffice = rawObject["head_office"]?.let { json.decodeFromJsonElement<InlineV1TaxSettingsPostRequestFormHeadOfficeXd7eefa39>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxSettingsPostRequestFormX6a746f8e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxSettingsPostRequestFormX6a746f8e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaults?.let { put("defaults", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.headOffice?.let { put("head_office", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxSettingsPostRequestFormX6a746f8e(block: InlineV1TaxSettingsPostRequestFormX6a746f8e.Builder.() -> Unit): InlineV1TaxSettingsPostRequestFormX6a746f8e = InlineV1TaxSettingsPostRequestFormX6a746f8e.build(block)
