package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_session_matching_options
 */
@Serializable(with = GelatoSessionMatchingOptions.Serializer::class)
public class GelatoSessionMatchingOptions(
  /**
   * Strictness of the DOB matching policy to apply.
   */
  public val dob: InlineGelatoSessionMatchingOptionsDobX124eab30? = null,
  /**
   * Strictness of the name matching policy to apply.
   */
  public val name: InlineGelatoSessionMatchingOptionsNameX7cc1dac6? = null,
) {
  public class Builder {
    /**
     * Strictness of the DOB matching policy to apply.
     */
    public var dob: InlineGelatoSessionMatchingOptionsDobX124eab30? = null

    /**
     * Strictness of the name matching policy to apply.
     */
    public var name: InlineGelatoSessionMatchingOptionsNameX7cc1dac6? = null

    public fun build(): GelatoSessionMatchingOptions = GelatoSessionMatchingOptions(
      dob = dob,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoSessionMatchingOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GelatoSessionMatchingOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoSessionMatchingOptions {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoSessionMatchingOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoSessionMatchingOptions must be a JSON object")
      return GelatoSessionMatchingOptions(
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineGelatoSessionMatchingOptionsDobX124eab30>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineGelatoSessionMatchingOptionsNameX7cc1dac6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoSessionMatchingOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoSessionMatchingOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoSessionMatchingOptions(block: GelatoSessionMatchingOptions.Builder.() -> Unit): GelatoSessionMatchingOptions = GelatoSessionMatchingOptions.build(block)
