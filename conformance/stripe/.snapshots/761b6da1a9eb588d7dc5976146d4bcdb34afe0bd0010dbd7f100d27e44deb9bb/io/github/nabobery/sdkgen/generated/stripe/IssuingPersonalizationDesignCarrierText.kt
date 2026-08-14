package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class IssuingPersonalizationDesignCarrierTextView(
  @SerialName("footer_body")
  public val footerBody: String? = null,
  @SerialName("footer_title")
  public val footerTitle: String? = null,
  @SerialName("header_body")
  public val headerBody: String? = null,
  @SerialName("header_title")
  public val headerTitle: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_personalization_design_carrier_text
 */
@Serializable(with = IssuingPersonalizationDesignCarrierText.Serializer::class)
public class IssuingPersonalizationDesignCarrierText(
  /**
   * The footer body text of the carrier letter.
   */
  public val footerBody: String? = null,
  /**
   * The footer title text of the carrier letter.
   */
  public val footerTitle: String? = null,
  /**
   * The header body text of the carrier letter.
   */
  public val headerBody: String? = null,
  /**
   * The header title text of the carrier letter.
   */
  public val headerTitle: String? = null,
) {
  public class Builder {
    /**
     * The footer body text of the carrier letter.
     */
    public var footerBody: String? = null

    /**
     * The footer title text of the carrier letter.
     */
    public var footerTitle: String? = null

    /**
     * The header body text of the carrier letter.
     */
    public var headerBody: String? = null

    /**
     * The header title text of the carrier letter.
     */
    public var headerTitle: String? = null

    public fun build(): IssuingPersonalizationDesignCarrierText = IssuingPersonalizationDesignCarrierText(
      footerBody = footerBody,
      footerTitle = footerTitle,
      headerBody = headerBody,
      headerTitle = headerTitle,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingPersonalizationDesignCarrierText = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingPersonalizationDesignCarrierText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingPersonalizationDesignCarrierText {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingPersonalizationDesignCarrierText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingPersonalizationDesignCarrierText must be a JSON object")
      return IssuingPersonalizationDesignCarrierText(
        footerBody = rawObject["footer_body"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        footerTitle = rawObject["footer_title"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        headerBody = rawObject["header_body"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        headerTitle = rawObject["header_title"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingPersonalizationDesignCarrierText) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingPersonalizationDesignCarrierText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.footerBody?.let { put("footer_body", it) }
        value.footerTitle?.let { put("footer_title", it) }
        value.headerBody?.let { put("header_body", it) }
        value.headerTitle?.let { put("header_title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingPersonalizationDesignCarrierText(block: IssuingPersonalizationDesignCarrierText.Builder.() -> Unit): IssuingPersonalizationDesignCarrierText = IssuingPersonalizationDesignCarrierText.build(block)
