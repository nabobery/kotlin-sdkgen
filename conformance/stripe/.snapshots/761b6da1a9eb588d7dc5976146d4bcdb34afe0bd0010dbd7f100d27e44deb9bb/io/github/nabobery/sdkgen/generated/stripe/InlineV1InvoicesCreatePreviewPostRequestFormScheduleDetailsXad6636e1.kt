package io.github.nabobery.sdkgen.generated.stripe

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
 * The schedule creation or modification params to apply as a preview. Cannot be used with `subscription` or
 * `subscription_` prefixed fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1(
  public val billingMode:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1? = null,
  public val endBehavior:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5? = null,
  phases: List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e>? = null,
  public val prorationBehavior:
      InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX932d9e3a? = null,
) {
  public val phases:
      List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e>? =
      phases?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var billingMode:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1? = null

    public var endBehavior:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5? = null

    private var phasesValue:
        List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e>? = null

    public var phases:
        List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e>?
      get() = phasesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        phasesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var prorationBehavior:
        InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX932d9e3a? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1(
      billingMode = billingMode,
      endBehavior = endBehavior,
      phases = phases,
      prorationBehavior = prorationBehavior,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1 must be a JSON object")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1(
        billingMode = rawObject["billing_mode"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsBillingModeXb4dccfa1>(it) },
        endBehavior = rawObject["end_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5>(it) },
        phases = rawObject["phases"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e>>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX932d9e3a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingMode?.let { put("billing_mode", json.encodeToJsonElement(it)) }
        value.endBehavior?.let { put("end_behavior", json.encodeToJsonElement(it)) }
        value.phases?.let { put("phases", json.encodeToJsonElement(it)) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1.build(block)
