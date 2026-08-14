package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_currency_specific_conf
 * ig
 */
@Serializable(with = TerminalConfigurationConfigurationResourceCurrencySpecificConfig.Serializer::class)
public class TerminalConfigurationConfigurationResourceCurrencySpecificConfig(
  fixedAmounts: List<Int>? = null,
  percentages: List<Int>? = null,
  /**
   * Below this amount, fixed amounts will be displayed; above it, percentages will be displayed
   */
  public val smartTipThreshold: Int? = null,
) {
  /**
   * Fixed amounts displayed when collecting a tip
   */
  public val fixedAmounts: List<Int>? = fixedAmounts?.let { collection0 -> collection0.toList() }

  /**
   * Percentages displayed when collecting a tip
   */
  public val percentages: List<Int>? = percentages?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var fixedAmountsValue: List<Int>? = null

    /**
     * Fixed amounts displayed when collecting a tip
     */
    public var fixedAmounts: List<Int>?
      get() = fixedAmountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        fixedAmountsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var percentagesValue: List<Int>? = null

    /**
     * Percentages displayed when collecting a tip
     */
    public var percentages: List<Int>?
      get() = percentagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        percentagesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Below this amount, fixed amounts will be displayed; above it, percentages will be displayed
     */
    public var smartTipThreshold: Int? = null

    public fun build(): TerminalConfigurationConfigurationResourceCurrencySpecificConfig = TerminalConfigurationConfigurationResourceCurrencySpecificConfig(
      fixedAmounts = fixedAmounts,
      percentages = percentages,
      smartTipThreshold = smartTipThreshold,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceCurrencySpecificConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalConfigurationConfigurationResourceCurrencySpecificConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceCurrencySpecificConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceCurrencySpecificConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourceCurrencySpecificConfig must be a JSON object")
      return TerminalConfigurationConfigurationResourceCurrencySpecificConfig(
        fixedAmounts = rawObject["fixed_amounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<Int>?>(element) },
        percentages = rawObject["percentages"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<Int>?>(element) },
        smartTipThreshold = rawObject["smart_tip_threshold"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourceCurrencySpecificConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceCurrencySpecificConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fixedAmounts?.let { put("fixed_amounts", json.encodeToJsonElement(it)) }
        value.percentages?.let { put("percentages", json.encodeToJsonElement(it)) }
        value.smartTipThreshold?.let { put("smart_tip_threshold", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfigurationConfigurationResourceCurrencySpecificConfig(block: TerminalConfigurationConfigurationResourceCurrencySpecificConfig.Builder.() -> Unit): TerminalConfigurationConfigurationResourceCurrencySpecificConfig = TerminalConfigurationConfigurationResourceCurrencySpecificConfig.build(block)
